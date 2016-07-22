package liu;

import java.util.Random;

public class Sensor {
    public static final double OFFSET = 16;

    public double popNextPressurePsiValue() {
        return OFFSET + samplePressure();
    }

    private static double samplePressure() {
        Random basicRandomNumbersGenerator = new Random(42);
        return 6 * basicRandomNumbersGenerator.nextDouble()
                * basicRandomNumbersGenerator.nextDouble();
    }
}
