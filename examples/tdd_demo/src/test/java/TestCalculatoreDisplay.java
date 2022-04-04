import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculatoreDisplay {

    private Calculator calc = new Calculator(45,20);

    @DisplayName("Its my favorite test case!")
    @Test
    public void testAddition(){
        //verify the functionality of addition
        assertEquals(this.calc.addition(),65);
    }

    @Test
    @Disabled("this is not finished!")
    public void testDivision(){
        System.out.println("running from subtraction");
        assertEquals(this.calc.subtraction(),25);
    }
}
