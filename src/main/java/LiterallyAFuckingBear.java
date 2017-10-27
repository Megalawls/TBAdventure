import java.util.Random;

public class LiterallyAFuckingBear {

    private boolean isMassive = true; //Stop it intellij, its not unused its an underlying fact
    private int scarinessOutOfTen = 10;
    private boolean isUndead = true;

    public int radius;
    public int x;
    public int y;

    public int notZero() {
        Random random = new Random();
        int toRetun = (0 - radius) + random.nextInt(radius - (0 - radius) +1);
        return toRetun;
    }

}
