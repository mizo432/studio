package org.venuspj.studio.core.model.event;

import org.venuspj.studio.generic.fundamentals.datetime.RecordYearMonth;

public class EventCriteria {
    RecordYearMonth.RecordYearMonthCriteria startYearMonthCriteria = new RecordYearMonth.RecordYearMonthCriteria();

    public void startYearMonthEqual(RecordYearMonth aRecordYearMonth) {
        startYearMonthCriteria.equal(aRecordYearMonth);
    }
}
