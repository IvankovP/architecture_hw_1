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
        assertEquals(1.0, result[0]);
        assertEquals(-1.0, result[1]);
    }

    @Test
    void oneRootTest() {
        double a = 1, b = 2, c = 1;
        double[] result = Calculations.solve(a, b, c);

        assertEquals(1, result.length);
        assertEquals(-1.0, result[0]);
    }

    @Test
    void firstParameterNotEqualsZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> Calculations.solve(0, 2, 1));
    }
}
