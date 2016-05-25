import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Usuario on 24/05/2016.
 */
public class KataStringCalculatorTest extends TestCase {

    @Test
    public void testAddWhenEmptyString(){
        KataStringCalculator calculator = new KataStringCalculator();

        assertEquals(0,calculator.add(""));

    }

}