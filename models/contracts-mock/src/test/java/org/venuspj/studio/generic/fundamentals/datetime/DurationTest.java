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
    public void toString01() throws Exception {
        Duration target = new Duration(new RecordDateTime(LocalDateTime.MIN), new RecordDateTime(LocalDateTime.MAX));
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Duration{startDateTime=RecordDateTime{-999999999-01-01T00:00}, endDateTime=RecordDateTime{+999999999-12-31T23:59:59.999999999}}");

    }

    @Test
    public void toString02() throws Exception {
        Duration target = new Duration(null, null);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Duration{}");

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