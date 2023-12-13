
import java.util.ArrayList;
public class Cell {
    private int row;
    private int column;
    private Boolean isBomb=false;
    private Boolean isFreeCell=false;
    private int neighborsCell=0;
    ArrayList<Cell> neigh = new ArrayList<Cell>(neighborsCell);
    public  Cell(int row,int column){
        this.row=row;
        this.column=column;
    }
    public void adne(Cell neighbor){
        this.neigh.add(neighbor);
        neighbor.neigh.add(this);

    }
    public void addMine(){
        if(this.isBomb==true){
            for(Cell neighbor:neigh){
                if(!neighbor.isBomb){
                    neighbor.neighborsCell++;
                }
            }
        }
    }
    public boolean isOpen(){
        return isFreeCell;
    }
    public void open(){
        isFreeCell=true;
    }
    public boolean containsMine(){
        return isBomb;
    }
    public String toString(){
            if(isFreeCell==false){
                return "-";
        }
            else if(isBomb){
                return "*";
            }
        return Integer.toString(neighborsCell);
    }

    public void isSetmine(boolean kb) {
         this.isBomb=kb;
    }
}
