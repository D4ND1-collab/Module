import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    private   Triangle testApplicationInstance;
    @Before
    public void before(){
        System.out.println("Before running ");
        testApplicationInstance = new Triangle();
    }
    @Test
    public void testing(){
        double x1 = 2;
        double x2 = 1;
        double x3 = 2;
        double y1 = 2;
        double y2 = 1;
        double y3 =2;
        double square = 0;
        double expect = 0;
        double result = testApplicationInstance.main(x1, x2,x3,y1,y2,y3, square);
        assertEquals(expect, result);

    }


}
