package architecture;

public class Calculations {

    private Calculations() {

    }

    public static double[] solve(double a, double b, double c) throws IllegalArgumentException {

        double epsilon = Math.pow(10d, -6);

        if (a > -epsilon && a < epsilon) {
            throw new IllegalArgumentException("First parameter must not equals zero");
        }

        double D = b * b - 4 * a * c;

        if (D > 0.0) {
            double x = (-b + Math.sqrt(D)) / 2 * a;
            double y = (-b - Math.sqrt(D)) / 2 * a;

            return new double[]{x, y};
        }

        if (D > -epsilon && D < epsilon) {
            double x = (-b + Math.sqrt(D)) / 2 * a;

            return new double[]{x};
        }

        return new double[0];
    }
}
