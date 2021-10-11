package Interface;

public class GameRunner {
    public static void main(String[] args) {

        GamingConsole gamingConsole = new Mario();
        gamingConsole.left();
        gamingConsole.right();
        gamingConsole.down();
        gamingConsole.up();

        System.out.println();

        GamingConsole gamingConsole1 = new Contra();
        gamingConsole1.left();
        gamingConsole1.right();
        gamingConsole1.down();
        gamingConsole1.up();
    }
}
