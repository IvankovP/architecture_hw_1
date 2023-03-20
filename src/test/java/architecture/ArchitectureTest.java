package architecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectureTest {

    @Test
    void bEqualsZeroTest() {
        assertArrayEquals(new double[0], Calculations.solve(1, 0, 1));
    }

    @Test
    void bEqualsZeroAndCNegativeTest() {
        double[] result = Calculations.solve(1, 0, -1);

        assertEquals(2, result.length);
        assertEquals(1d, result[0]);
        assertEquals(-1d, result[1]);
    }

    @Test
    void oneRootTest() {
        double[] result = Calculations.solve(1, 2, 1);

        assertEquals(1, result.length);
        assertEquals(-1d, result[0]);
    }

    @Test
    void firstParameterNotEqualsZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> Calculations.solve(0, 2, 1));
    }

    @Test
    void discriminantEqualsZeroTest() {
        double[] result = Calculations.solve(0.01, 0.001, 0.00001);

        assertEquals(1, result.length);
    }

    @Test
    void notNumberTest() {
        //данный тест сделан для примера, но думаю достаточно было сделать public static double[] solve(double a, double b, double c)
        assertThrows(IllegalArgumentException.class, () -> Calculations.solve(null, null, null));
    }
}
