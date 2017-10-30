import java.awt.*;
import java.util.ArrayList;

public class Player {
    private Point location = new Point(0,0);
    private boolean hasCompass = false;

    //Expandability, adding items to the ArrayList rather than changing some booleans
    //private ArrayList<String> inventory = new ArrayList<String>();

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    //isHasCompass sounds stupid as, but i got intelliJ to generate it for me and theres no way im writing getters and setters myself in 2017
    public boolean isHasCompass() {
        return hasCompass;
    }

    public void setHasCompass(boolean hasCompass) {
        this.hasCompass = hasCompass;
    }
}
