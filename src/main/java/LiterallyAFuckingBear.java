import java.util.Random;

public class LiterallyAFuckingBear {

    private boolean isMassive = true; //Stop it intellij, its not unused its an underlying fact
    private int scarinessOutOfTen = 10;
    private boolean isUndead = true;

    private int radius;
    private int x;
    private int y;

    private int notZero() {
        Random random = new Random();
        int min = 0 - radius;
        int max = radius;
        int toReturn = new Random().nextInt(max +1 - min) + min;
        return toReturn;
    }

    public LiterallyAFuckingBear(int radius) {
        this.radius = radius;
        this.x = notZero();
        this.y = notZero();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
