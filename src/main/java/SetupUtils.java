import java.util.InputMismatchException;
import java.util.Scanner;

public class SetupUtils {

    int getRadius(Scanner sc) {
        System.out.println("Please select a radius for the play area");
        try { //Math.abs ensures positive, catch block ensures int is returned
            return Math.abs(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException uGoofed) {
            System.out.println("Not a number, please enter an integer");
            int toReturn = Math.abs(getRadius(sc));
            return toReturn;
        }
    }

    Difficulty getDifficulty(Scanner sc) {
        System.out.println("Please select a difficulty");
        try {
            return Difficulty.valueOf(sc.nextLine().toLowerCase());
        } catch (IllegalArgumentException uGoofed) {
            System.out.println("Not a difficulty, please pick from the following:\n" +
                    "Easy: Start with compass\n" +
                    "Medium: Have to find compass\n" +
                    "Hard: Medium but with an undead bear roaming around");
            return getDifficulty(sc);
        }
    }

}
