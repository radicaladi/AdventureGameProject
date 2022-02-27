import java.util.Scanner;

public class Game {
    static int Health;
    static int Stamina;
    static int Magicka;

    public static void gameStart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Start new Adventure?: [y/n]");
        String confirmStart = input.next();
        if (confirmStart.equalsIgnoreCase("y")) {
            playerInfo();
        }
        else if (confirmStart.equalsIgnoreCase("n")) {
            System.out.println("Tomorrow awaits us all, traveller...");
        }
    }

    public static void playerInfo() {

    }

    public static void main(String[] args) {
        gameStart();
    }
}
