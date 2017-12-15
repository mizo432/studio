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

}