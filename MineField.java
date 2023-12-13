import java.util.Random;
import java.util.Arrays;
public class MineField {
    private int wide;
    private int Bombs;
    private Cell [][]  board;


    public  MineField(int wide,int Bombs){
        this.wide=wide;
        this.Bombs=Bombs;
        this.board=new  Cell [wide][wide];
        initializeCells();
        initializeMines();
    }

    public void initializeCells(){
        for(int row=0;row<wide;row++){
            for(int column=0;column<wide;column++){
                Cell cell=new Cell(0,0);

                 board[row][column]=cell;
            }
        }
    }
    private void initializeMines() {
        Random rand = new Random(2023);
        int count = 0;
        while (count < Bombs) {
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            if (!board[row][col].containsMine()) {
                board[row][col].isSetmine(true);
                count++;
            }
        }
    }
    public Cell getCell(int i, int j){
         return board[i][j];
    }
    public  boolean iskopen(int i ,int j){
        if(board[i][j].isOpen()){
            return true;
        }
        return false;
    }
    public void print() {
        System.out.print("  ");
        for (int i = 0; i < wide; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < wide; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < wide; j++) {
                    System.out.print( board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        MineField k=new MineField(10,20);
        k.initializeCells();
        k.initializeMines();
        for(int i =0;i<k.wide;i++){
            for(int j=0;j<k.wide;j++){
                k.getCell(i,j).open();
            }
        }
       k.print();
        }
}
