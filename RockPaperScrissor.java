import java.util.Random;
import java.util.Scanner;

public class RockPaperScrissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] rps = {"r", "p", "s" };
            String Aimove = rps[new Random().nextInt(rps.length)];

            String playerMove;
            while (true) {
                System.out.println("please enter your move");
                playerMove = sc.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " not a valid move");

            }
            System.out.println("Aiplayed:" + Aimove);
            if (playerMove.equals(Aimove)) {
                System.out.println("ohh game is ties try again");

            } else if (playerMove.equals("r")) {
                if (Aimove.equals("p")) {
                    System.out.println("ohh no you loss");
                } else if (Aimove.equals("s")) {
                    System.out.println("Hurray you won");
                }
            } else if (playerMove.equals("p")) {
                if (Aimove.equals("r")) {
                    System.out.println("Hurray you won");
                } else if (Aimove.equals("s")) {
                    System.out.println("ohh no you loss");
                }
            } else if (playerMove.equals("s")) {
                if (Aimove.equals("p")) {
                    System.out.println("Hurray you won");
                } else if (Aimove.equals("r")) {
                    System.out.println("ohh no you loss");
                }
            }
            System.out.println("play again(y/n)");
            String playagain = sc.nextLine();
            if(!playagain.equals("y")){
                break;
            }


        }
    }

}