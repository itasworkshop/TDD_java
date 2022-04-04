import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatorAssertions {

    private Calculator calc = new Calculator(45,20);

    @Test
    public void testAssertTrue(){
        assertTrue(2<5);
    }

    @Test
    public void testAssertAll(){
        int[] numbers  = {1,2,3,4,5,6};

        assertAll("numbers",
                () -> assertEquals(numbers[0],1),
                () -> assertEquals(numbers[3],2)
        );
    }
}
