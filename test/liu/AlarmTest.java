package liu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlarmTest {
    @Test
    public void should_not_raise_alarm_with_a_normal_pressure_value() {
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        Alarm alarm = new Alarm(stubSensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void a_error_pressure_value_should_raise_the_alarm() {
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.HIGH_PRESSURE_THRESHOLD + 1);
        Alarm alarm = new Alarm(stubSensor);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}
