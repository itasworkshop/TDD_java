import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAssertException {

    private Calculator calc = new Calculator(45,20);

    @Test
    public void testDivision1(){
        assertEquals(this.calc.division(10,5),2);
    }

    @Test
    public void testDivisionWithZero(){
        //assertEquals(this.calc.division(10,0),2);
        assertThrows(ArithmeticException.class, () -> {this.calc.division(10,0);});
    }
}
