import org.junit.*;
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
        assertEquals((BearyMcBearington.getX()<=5 && BearyMcBearington.getX()>=-5), true);
        assertEquals((BearyMcBearington.getY()<=5 && BearyMcBearington.getY()>=-5), true);
    }

}
