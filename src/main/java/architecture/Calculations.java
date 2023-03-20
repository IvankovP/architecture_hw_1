package architecture;

public class Calculations {

    private Calculations() {

    }

    public static double[] solve(Number a, Number b, Number c) throws IllegalArgumentException {

        if (a == null || b == null || c == null || !(a instanceof Number) || !(b instanceof Number) || !(c instanceof Number)) {
            throw new IllegalArgumentException("Parameters must be number");
        }

        double epsilon = Math.pow(10d, -4);

        if (a.doubleValue() > -epsilon && a.doubleValue() < epsilon) {
            throw new IllegalArgumentException("First parameter must not equals zero");
        }

        double D = b.doubleValue() * b.doubleValue() - 4 * a.doubleValue() * c.doubleValue();

        if (D > epsilon) {
            double x = (-b.doubleValue() + Math.sqrt(D)) / 2 * a.doubleValue();
            double y = (-b.doubleValue() - Math.sqrt(D)) / 2 * a.doubleValue();

            return new double[]{x, y};
        }

        if (D > -epsilon && D < epsilon) {
            double x = (-b.doubleValue() + Math.sqrt(D)) / 2 * a.doubleValue();

            return new double[]{x};
        }

        return new double[0];
    }
}
