import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Usuario on 24/05/2016.
 */
public class KataStringCalculatorTest  {

    @Test
    public void testAddWhenEmptyString() throws Exception {
        KataStringCalculator calculator = new KataStringCalculator();
        assertEquals(0,calculator.add(""));
    }

    @Test
    public void testAddWhenSingleValue() throws Exception {
        KataStringCalculator calculator = new KataStringCalculator();
        assertEquals(123, calculator.add("123"));
    }

    @Test
    public void testAddWithTwoValues() throws Exception {
        KataStringCalculator calculator = new KataStringCalculator();
        assertEquals(17,calculator.add("10,7"));
        assertEquals(17,calculator.add("10 7"));
        assertEquals(17,calculator.add("10\n7"));
    }

    @Test(expected = Exception.class)
    public void testAddWhenIsNegative()throws Exception {
        KataStringCalculator calculator = new KataStringCalculator();
        calculator.add("-10");
        calculator.add("-10 8");
    }

}