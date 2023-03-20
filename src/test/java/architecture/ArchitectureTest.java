package architecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectureTest {

    @Test
    void bEqualsZeroTest() {
        double a = 1, c = 1;
        assertArrayEquals(new double[0], Calculations.solve(a, 0, c));
    }

    @Test
    void bEqualsZeroAndCNegativeTest() {
        double a = 1, c = -1;
        double[] result = Calculations.solve(a, 0, c);

        assertEquals(2, result.length);
        assertEquals(0.0, Math.abs(result[0] % 1));
        assertEquals(0.0, Math.abs(result[1] % 1));
    }
}
