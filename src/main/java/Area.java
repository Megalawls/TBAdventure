import java.util.ArrayList;
import java.util.stream.IntStream;

public class Area {
    private int radius;
    private Difficulty difficulty;

    public Area(int radius, Difficulty difficulty) {
        this.radius = radius;
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getRadius() {
        return radius;
    }
}
