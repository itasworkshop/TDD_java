
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    private Calculator calc = new Calculator(45,20);

    @Test
    public void testAddition(){
        //verify the functionality of addition
        assertEquals(this.calc.addition(),65);
    }

}
