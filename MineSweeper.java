
public class MineSweeper {
    MineField k;
    Player z;
    Player w;
    private int score1=0;
    private int score2=0;
    public MineSweeper(int size, int bombs, String player1, String player2) {
        this.k = new MineField(size, bombs);
        this.z = new Player(player1);
        this.w = new Player(player2);

    }
    public void play() {
        int n=0;
        int gameover = 20;
        Player cureent=z;
        while (n<gameover) {
            k.print();
            boolean foundMine = z.play(k);

            if(foundMine==true){
                if(cureent==z){
                    score1++;
                    System.out.println(" mine in board are :"+(gameover-n-1));

                    System.out.println("player 1 "+z.getName()+score1+"mines found");
                    System.out.println("player 2 "+w.getName()+score2+"mines found");
                    n++;
                    if(cureent==z){
                        cureent=w;
                    }
                    else{
                        cureent=z;
                    }

                }
                else{
                    score2++;
                    System.out.println(" mines in board are "+(gameover-n-1));
                    System.out.println(k.toString());
                    System.out.println("player 1 "+z.getName()+score1+"mines found");
                    System.out.println("player 2 "+w.getName()+score2+"mines found");
                    n++;
                    if(cureent==z){
                        cureent=w;
                    }
                    else{
                        cureent=z;
                    }

                }
            }
            else{
                System.out.println(k.toString());
                System.out.println("nextPlayer");
                if(cureent==z){
                    cureent=w;
                }
                else{
                    cureent=z;
                }
            }

        }
        System.out.println("Mines found: " + (score1 + score2));
        System.out.println("Mines remaining: 0");
        if(score1>score2){
            System.out.println("player 1 "+z.getName()+score1+" mines found wins ");
        } else if (score1<score2) {
            System.out.println("player 2 "+w.getName()+score2+"mines found wins ");
        }
        else{
            System.out.println("Its a tie");
        }
    }
}

