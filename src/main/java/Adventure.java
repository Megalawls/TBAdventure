import java.util.InputMismatchException;
import java.util.Scanner;

public class Adventure {

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SetupUtils setup = new SetupUtils();

        System.out.println("Welcome to this Text-Based adventure");
        Area playArea = new Area(setup.getRadius(sc), setup.getDifficulty(sc));

        Player player = new Player();

        if (playArea.getDifficulty() == Difficulty.easy) {
            player.setHasCompass(true);
        } else if (playArea.getDifficulty() == Difficulty.medium) {
            Compass compass = new Compass(playArea.getRadius());
        } else {
            LiterallyAFuckingBear bear = new LiterallyAFuckingBear(playArea.getRadius());
        }
    }

}
