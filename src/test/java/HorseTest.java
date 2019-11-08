
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
public class HorseTest {
    private   Horse testApplicationInstance;
    @Before
    public void before(){
        System.out.println("Before running ");
        testApplicationInstance = new Horse();
    }
    @Test
    public void testing(){
        int i = 9;
        int j = 7;
        int iFinal = 5;
        int jFinal = 4;
        boolean result = testApplicationInstance.main(i, j, iFinal, jFinal);
        boolean expect = false;
        assertEquals(false, result);
    }

}
