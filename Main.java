import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Give the board size:\n");
        int size= scan.nextInt();
        System.out.println("Give the number of mines:");
        int bombs=scan.nextInt();
        System.out.println("Give the names of the players:\n");
        String player1=scan.next();
        System.out.println("Give the names of the players:\n");
        String player2= scan.next();
        MineSweeper game=new MineSweeper(size,bombs,player1,player2);
        game.play();
    }
}