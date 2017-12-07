package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class DurationTest {

    @Test
    public void startDateTime() throws Exception {
        Duration target = new Duration(new RecordDateTime(LocalDateTime.MIN), new RecordDateTime(LocalDateTime.MAX));
        RecordDateTime actual = target.startDateTime();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(new RecordDateTime(LocalDateTime.MIN));
    }

    @Test
    public void endDateTime() throws Exception {
        Duration target = new Duration(new RecordDateTime(LocalDateTime.MIN), new RecordDateTime(LocalDateTime.MAX));
        RecordDateTime actual = target.endDateTime();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(new RecordDateTime(LocalDateTime.MAX));
    }

    @Test
    public void toString03() throws Exception {
        Duration target = new Duration();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Duration{}");

    }

}