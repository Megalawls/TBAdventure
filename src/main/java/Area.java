import java.util.ArrayList;
import java.util.stream.IntStream;

public class Area {
    private int radius;
    public Difficulty difficulty;
    public int[] x = IntStream.rangeClosed((0-radius), (radius)).toArray();;
    public int[] y = IntStream.rangeClosed((0-radius), (radius)).toArray();;

    public Area(int radius, Difficulty difficulty) {
        this.radius = radius;
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }
}
