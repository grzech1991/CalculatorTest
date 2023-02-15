import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
        System.out.println("Before All");
    }



    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(3, 5);
        assertEquals(-2, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    void testDivide() {
        int result = calculator.divide(3, 5);
        assertEquals(0, result);
    }

    @Test
    public void testCompareObjects() {
        Calculator calculatorTwo = new Calculator();

        assertEquals(calculatorTwo, calculator);
        assertNotSame(calculator,calculatorTwo);

    }
}