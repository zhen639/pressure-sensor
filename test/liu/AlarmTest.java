package liu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AlarmTest {
    @Test
    public void should_not_raise_alarm_with_a_normal_pressure_value() {
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        Alarm alarm = new Alarm(stubSensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }
}
