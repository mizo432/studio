package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.*;

public class PeriodTest {
    @Test
    public void startDate() throws Exception {
        Period target = new Period(new RecordDate(LocalDate.MIN), new RecordDate(LocalDate.MAX));
        RecordDate actual = target.startDate();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(new RecordDate(LocalDate.MIN));
    }

    @Test
    public void endDate() throws Exception {
        Period target = new Period(new RecordDate(LocalDate.MIN), new RecordDate(LocalDate.MAX));
        RecordDate actual = target.endDate();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(new RecordDate(LocalDate.MAX));
    }

    @Test
    public void toString01() throws Exception {
        Period target = new Period(new RecordDate(LocalDate.MIN), new RecordDate(LocalDate.MAX));
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Period{startDate=RecordDate{-999999999-01-01}, endDate=RecordDate{+999999999-12-31}}");

    }

    @Test
    public void toString02() throws Exception {
        Period target = new Period(null, null);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Period{}");

    }

    @Test
    public void toString03() throws Exception {
        Period target = new Period();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Period{}");

    }

}