import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unittesting.SumCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testReturnsOne() {
        // When
        int actual = calc.sum(1);

        // Then
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testReturnsSix() {
        // When
        int actual = calc.sum(3);

        // Then
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
