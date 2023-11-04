import java.util.Scanner;

public class Main {
    public static Player player;
    public static Game game;
    public static Scanner scanner;
    public static void beginDay() {
        System.out.printf("Day %d\n", game.Day);
        System.out.println("You wake up");
        System.out.println("What would you like to do?: ");
        String response = scanner.nextLine();
    }

    public static void endDay() {
        System.out.println("You go to sleep\n");
    }

    public static void main(String[] args) {
        player = new Player();
        game = new Game();
        scanner = new Scanner(System.in);
        player.Health = 20;
        player.Energy = 20;
        player.Hunger = 20;
        player.Thirst = 20;
        game.Day = 1;

        while (true) {
            beginDay();
            endDay();
            game.Day += 1;
        }

        //player.Hitbox =
    }
}