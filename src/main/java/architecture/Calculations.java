package architecture;

public class Calculations {

    private Calculations() {

    }

    public static double[] solve(double a, double b, double c) {

        double D = b * b - 4 * a * c;

        if (D > 0.0) {
            double x = (-b + Math.sqrt(D)) / 2 * a;
            double y = (-b - Math.sqrt(D)) / 2 * a;

            return new double[]{x, y};
        }

        if (D >= 0 && D < Math.pow(10d, -6)) {
            double x = (-b + Math.sqrt(D)) / 2 * a;

            return new double[]{x};
        }

        return new double[0];
    }
}
