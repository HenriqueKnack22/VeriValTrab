import org.junit.Test;
import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));  // Verifica se 5 * 2 = 10
        assertEquals(new Franc(15), five.times(3));  // Verifica se 5 * 3 = 15
    }

    @Test
    public void testEquality() {
        assertTrue(new Franc(5).equals(new Franc(5)));   // Verifica se 5 é igual a 5
        assertFalse(new Franc(5).equals(new Franc(6)));  // Verifica se 5 não é igual a 6
    }
}
