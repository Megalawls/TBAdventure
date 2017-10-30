import java.awt.*;
import java.util.Random;

public class MovementUtils {

    int notZero(int radius) {
        Random random = new Random();
        int min = 0 - radius;
        int max = radius;
        int toReturn = new Random().nextInt(max +1 - min) + min;
        return toReturn;
    }

    Point notIntersect(int radius){
        Point toReturn = new Point(notZero(radius), notZero(radius));
        if(toReturn.equals(new Point(0, 0))){
            return notIntersect(radius);
        }
        else {
            return toReturn;
        }
    }


}
