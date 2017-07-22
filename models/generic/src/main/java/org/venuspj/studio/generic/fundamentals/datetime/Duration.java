package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.util.objects2.Objects2;

public class Duration {
    protected RecordDateTime startDateTime;
    protected RecordDateTime endDateTime;

    Duration() {
    }

    public Duration(RecordDateTime aStartDate, RecordDateTime anEndDateTime) {
        startDateTime = aStartDate;
        endDateTime = anEndDateTime;
    }

    public RecordDateTime startDateTime() {
        return startDateTime;
    }

    public RecordDateTime endDateTime() {
        return endDateTime;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("startDateTime", startDateTime)
                .add("endDateTime", endDateTime)
                .omitNullValues()
                .toString();
    }
}
