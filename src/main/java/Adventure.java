import java.util.InputMismatchException;
import java.util.Scanner;

public class Adventure {

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SetupUtils setup = new SetupUtils();

        System.out.println("Welcome to this Text-Based adventure");
        Area playArea = new Area(setup.getRadius(sc), setup.getDifficulty(sc));

        System.out.println(playArea.getDifficulty());
        System.out.println(playArea.getRadius());


    }

}
