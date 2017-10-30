import org.junit.*;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClassTester {

    Area testArea;
    LiterallyAFuckingBear BearyMcBearington;

    @Before
    public void instantiate(){
        testArea = new Area(5, Difficulty.easy);
        BearyMcBearington = new LiterallyAFuckingBear(testArea.getRadius());
    }

    @Test
    public void area(){
        assertNotNull(testArea);
        assertEquals(testArea.getRadius(), 5);
        assertEquals(testArea.getDifficulty(), Difficulty.easy);
    }

    @Test
    public void bear(){
        assertNotNull(BearyMcBearington);
        assertEquals((BearyMcBearington.getLocation().x <=5 && BearyMcBearington.getLocation().x >=-5), true);
        assertEquals((BearyMcBearington.getLocation().y <=5 && BearyMcBearington.getLocation().y >=-5), true);
        Point beforeMove = BearyMcBearington.getLocation();
        BearyMcBearington.move();
        assertEquals((BearyMcBearington.getLocation().x <=5 && BearyMcBearington.getLocation().x >=-5), true);
        assertEquals((BearyMcBearington.getLocation().y <=5 && BearyMcBearington.getLocation().y >=-5), true);
        if(BearyMcBearington.getLocation().x != testArea.getRadius() && BearyMcBearington.getLocation().x != (0 - testArea.getRadius())){
            //test that bears x loc has changed, and do the same for y
        }
        if(BearyMcBearington.getLocation().x != testArea.getRadius() && BearyMcBearington.getLocation().x != (0 - testArea.getRadius())){

        }
    }

}
