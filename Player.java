import java.util.Scanner;
public class Player {
    private String name;
    private int score=0;
    public  Player(String name){
        this.name=name;
    }
    public boolean play(MineField kz) {
        Scanner in = new Scanner(System.in);
        boolean isFreeCellz=false;
        while (!isFreeCellz) {
            System.out.println("player give the coordrinates for the cell");
            int row = in.nextInt();
            int column = in.nextInt();
            kz.getCell(row,column).open();
            boolean z=kz.iskopen(row,column);
            if(z==true){

                Cell cell=kz.getCell(row,column);
                if(cell.containsMine()){
                    isFreeCellz=true;
                    this.score++;
                    kz.getCell(row,column).open();
                    kz.print();
                }
                return isFreeCellz;
            }
            else{
                break;
            }
        }
        return  isFreeCellz;
    }
    public void printStatus(){
         System.out.println(getScore()+getName());
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
}
