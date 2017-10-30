import java.awt.*;
import java.util.Random;

public class Compass {
    private Point location;
    private int radius;

    MovementUtils compassUtils = new MovementUtils();

    public Compass(int radius) {
        this.location = compassUtils.notIntersect(radius);
        this.radius = radius;
    }
}
