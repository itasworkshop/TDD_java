import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculatorFixtures {

    private Calculator calc = new Calculator(45,20);

    @BeforeAll
    static void setup1(){
        System.out.println("running before all test cases.");
    }

    @BeforeEach
    void setup2(){
        System.out.println("running before each test cases.");
    }

    @AfterAll
    static void setup3(){
        System.out.println("running after all test cases.");
    }

    @AfterEach
    void setup4(){
        System.out.println("running after each test cases.");
    }

    @Test
    public void testAddition(){
        System.out.println("running from addition.");
        assertEquals(this.calc.addition(),65);
    }

    @Test
    public void testSubtraction(){
        System.out.println("running from subtraction");
        assertEquals(this.calc.subtraction(),25);
    }

}
