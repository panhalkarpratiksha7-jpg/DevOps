import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    void testPositiveNumbers() {
        int result = App.add(10, 20);

        assertEquals(30, result);
        assertTrue(App.isPositive(10));
        assertTrue(App.isPositive(20));
    }

    @Test
    void testNegativeNumber() {
        int a = 10;
        int b = -20;

        assertTrue(!App.isPositive(b));
    }
}
