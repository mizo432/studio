package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.util.objects2.Objects2;

public class Period {
    protected RecordDate startDate;
    protected RecordDate endDate;

    Period() {
    }

    public Period(RecordDate aStartDate, RecordDate anEndDate) {
        startDate = aStartDate;
        endDate = anEndDate;
    }

    public RecordDate startDate() {
        return startDate;
    }

    public RecordDate endDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .omitNullValues()
                .toString();
    }
}
