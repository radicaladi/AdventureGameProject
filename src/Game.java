import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        initialize();
    }

    public static void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Start new Adventure?: [y/n]");
        String confirmStart = input.next();
        if (confirmStart.equalsIgnoreCase("y")) {
            gameStart();
        }
        else if (confirmStart.equalsIgnoreCase("n")) {
            System.out.println("Tomorrow awaits us all, traveller...");
        }
    }
    public static void gameStart() {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("\"Outstretched before you is a long dirt path. Well, travelled, surrounded by the uplands of this province, graced by dwarf shrubs and greenery.'\n" +
                "You've been travelling along this path for quite some time, towards your destination but in the distance you see someone along the road... waiting.\n" +
                "As you come near, you see this person is but an old man... blind... he asks you" + "A coin for your future? A coin for your fate...\n" +
                "Do you give charity?: [y/n]");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        String confirm = input.next();
        if (confirm.equalsIgnoreCase("y")) {
            System.out.println("Ah, thank you traveller... Just as evil begat evil your whole life long, so good may beget good.\t");
            // initialize some other method to advance the story
        }
        else if (confirm.equalsIgnoreCase("n")){
            System.out.println("A coin... a coin for the blind.");
            // initialize a separate kind of method from the above to advance the story
        }
    }

}
