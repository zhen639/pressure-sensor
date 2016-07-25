package liu;

public class Alarm {
    public static final double LOW_PRESSURE_THRESHOLD = 17;
    private final double HighPressureThreshold = 21;
    private Sensor sensor = new Sensor();
    private boolean alarmOn = false;

    public Alarm(Transducer transducer) {

    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();
        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || psiPressureValue > HighPressureThreshold) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
