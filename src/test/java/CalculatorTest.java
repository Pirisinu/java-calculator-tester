import javaCalculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    // Instanzio il calcolatore
    Calculator calculator;

    // Lo utilizzo ad ogni test
    @BeforeEach
    void createInstance() {
        calculator = new Calculator();
    }

    // Test somma
    @Test
    @DisplayName("Summ test")
    public void testAdd() {
        // Controllo con input validi
        assertEquals(5.0f, calculator.add(2.0f, 3.0f), 0.0f);

        // Controllo con un input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.add(Float.NaN, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.add( 3.0f,Float.NaN));

        // Controllo con entrambe gli input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.add(Float.NaN, Float.NaN));

        // Controllo oltre limite max value
        assertThrows(IllegalArgumentException.class, () -> calculator.add(Float.MAX_VALUE, 1.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.add(1.0f, Float.MAX_VALUE));
    }

    // Test sottrazione
    @Test
    @DisplayName("Subtraction test")
    public void testSubtract(){}

    // Test moltiplicatione
    @Test
    @DisplayName("Multiplication test")
    public void testMultiply(){}

    // Test divisione
    @Test
    @DisplayName("Division test")
    public void testDivide(){}

}
