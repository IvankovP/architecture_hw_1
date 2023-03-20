package architecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArchitectureTest {

    @Test
    void bEqualsZeroTest() {
        double a = 1, c = 1;
        assertArrayEquals(new double[0], Calculations.solve(a, 0, c));
    }
}
