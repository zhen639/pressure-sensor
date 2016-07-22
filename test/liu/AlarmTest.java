package liu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AlarmTest {
    @Test
    public void should_not_raise_alarm_with_a_normal_pressure_value() {
        Alarm alarm = new Alarm();
        assertFalse(alarm.isAlarmOn());
    }
}
