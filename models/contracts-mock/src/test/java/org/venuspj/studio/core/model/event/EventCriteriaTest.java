package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.venuspj.studio.generic.fundamentals.datetime.RecordYearMonth;

import static org.venuspj.util.objects2.Objects2.*;

public class EventCriteriaTest {

    @Test
    public void name() {
        EventCriteria eventCriteria = new EventCriteria();
        RecordYearMonth recordYearMonth = RecordYearMonth.of(2017, 11);
        eventCriteria.startYearMonthEqual(recordYearMonth);
        System.out.println(toStringHelper(eventCriteria).defaultConfig());
    }
}
