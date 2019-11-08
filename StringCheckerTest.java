import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
public class StringCheckerTest {
    private   StringChecker testApplicationInstance;
    @Before
    public void before(){
        System.out.println("Before running ");
        testApplicationInstance = new StringChecker();
    }
    @Test
    public void testing(){
        String s = "{}[";
        boolean expected = false;
        boolean result = testApplicationInstance.str(s);
        assertEquals(false, result);
    }
}
