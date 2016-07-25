package liu;

import java.util.Random;

public class Sensor implements Transducer {
    public static final double OFFSET = 16;

    @Override
    public double popNextPressurePsiValue() {
        return OFFSET + samplePressure();
    }

    private static double samplePressure() {
        Random basicRandomNumbersGenerator = new Random(42);
        return 6 * basicRandomNumbersGenerator.nextDouble()
                * basicRandomNumbersGenerator.nextDouble();
    }
}
