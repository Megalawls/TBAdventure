import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LiterallyAFuckingBear {

    private boolean isMassive = true; //Stop it intellij, its not unused its an underlying fact
    private int scarinessOutOfTen = 10;
    private boolean isUndead = true;

    private int radius;
    private Point location;

    MovementUtils bearMovement = new MovementUtils();

    public void move() {
        int[] whichWay = {-1, 1};
        //The below is apparently the new standard way to generate random numbers, as it removes the need to generate a new random first
        int randomy = ThreadLocalRandom.current().nextInt(0, 2);
        int randomx = ThreadLocalRandom.current().nextInt(0, 2);
        //Ensures movement only within the boundary of the field
        if((this.location.x - whichWay[randomx]) <= radius && (this.location.x - whichWay[randomx]) >= (0-radius)){
            this.location.x = this.location.x + whichWay[randomx];
        }
        if((this.location.y + whichWay[randomy]) <= radius && (this.location.y + whichWay[randomy]) >= (0-radius)) {
            this.location.y = this.location.y + whichWay[randomy];
        }
    }

    public LiterallyAFuckingBear(int radius) {
        this.radius = radius;
        this.location = bearMovement.notIntersect(radius);
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
