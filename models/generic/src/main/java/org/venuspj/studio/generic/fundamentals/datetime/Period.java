package org.venuspj.studio.generic.fundamentals.datetime;

public class Period {
    protected RecordDate startDate;
    protected RecordDate endDate;

    Period() {
    }

    public Period(RecordDate aStartDate, RecordDate anEndDate) {
        startDate = aStartDate;
        endDate = anEndDate;
    }

    public static Period emptyPeriod() {
        return new Period(RecordDate.emptyRecordDate(), RecordDate.emptyRecordDate());
    }

    public RecordDate startDate() {
        return startDate;
    }

    public RecordDate endDate() {
        return endDate;
    }

}
