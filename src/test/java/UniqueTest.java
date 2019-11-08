import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class UniqueTest {
    private   Unique testApplicationInstance;
    @Before
    public void before(){
        System.out.println("Before running ");
        testApplicationInstance = new Unique();
    }
    @Test
    public void testing(){
        int [] arr = {1, 3, 3, 7};
        int result = testApplicationInstance.main(arr);
        int expect = 3;
        assertEquals(expect, result);
    }

}
