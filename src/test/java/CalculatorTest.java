import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    // a * (b + c / d);
    @Test
    public void testEq(){
        assertEquals(calculator.getEquation( 1 , 2, 4, 2), 4, 0.1);
        assertEquals(calculator.getEquation( 1 , 2, 3, 2), 3.5, 0.1);
        assertEquals(calculator.getEquation( 1 , 1, 3, 2), 2.5, 0.1);
    }


}
