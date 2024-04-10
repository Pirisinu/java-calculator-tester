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
    }

    // Test sottrazione
    @Test
    @DisplayName("Subtraction test")
    public void testSubtract(){
         // Controllo con input validi
        assertEquals(2.0f, calculator.subtract(5.0f, 3.0f), 0.0f);

        // Controllo con un input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(Float.NaN, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract( 3.0f,Float.NaN));

        // Controllo con entrambe gli input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(Float.NaN, Float.NaN));
    }

    // Test moltiplicatione
    @Test
    @DisplayName("Multiplication test")
    public void testMultiply(){
         // Controllo con input validi
        assertEquals(20.0f, calculator.multiply(10.0f, 2.0f), 0.0f);

        // Controllo con un input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(Float.NaN, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply( 3.0f,Float.NaN));

        // Controllo con entrambe gli input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(Float.NaN, Float.NaN));
    }

    // Test divisione
    @Test
    @DisplayName("Division test")
    public void testDivide(){
         // Controllo con input validi
        assertEquals(2.0f, calculator.divide(10.0f, 5.0f), 0.0f);

        // Controllo con un input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(Float.NaN, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide( 3.0f,Float.NaN));

        // Controllo con entrambe gli input NaN
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(Float.NaN, Float.NaN));
    }

}
