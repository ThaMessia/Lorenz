package studio.thamessia;

public class Attractor {
    public static String calculate() {
        double x, y, z;
        x = 0.1;
        y = 0;
        z = 0;

        double a = 10.0;
        double b = 28.0;
        double c = 8.0 / 3.0;
        double t = 0.01;

        for (var i = 0; i < 1000; i++) {
            double xt = x + t * a * (y - x);
            double yt = y + t * (x * (b - z) - y);
            double zt = z + t * (x * y - c * z);

            x = xt;
            y = yt;
            z = zt;

        }

        return parseManager(x, y, z);
    }

    private static String parseManager(double x, double y, double z) {
        return "[\n" + x + "\n" + y + "\n" + z + "\n]";
    }
}
