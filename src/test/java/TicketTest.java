import javaCalculator.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    private Ticket ticket;

    // Istanza vuota per ogni Test
    @BeforeEach
    void createTicketInstance() {
        ticket = null;
    }
    // Test metodi di Ticket
    @Test
    @DisplayName("Ticket method calculate price")
    void testCalculatePrice() {
        // Normal ticket
        ticket = new Ticket(100,30);
        assertEquals(21.0, ticket.calculatePrice(),0.0);
        // Under age ticket
        ticket = new Ticket(100,14);
        assertEquals(16.8, ticket.calculatePrice(),0.0);
        // Over age ticket
        ticket = new Ticket(100,80);
        assertEquals(10.5, ticket.calculatePrice(),0.0);
    }
    // Test costruttore con parametri invalidi
    @Test
    @DisplayName("Test constructor with invalid parameters")
    void testConstructorWithInvalidParameters() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-10, 20));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -5));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 20));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 0));
    }

}
