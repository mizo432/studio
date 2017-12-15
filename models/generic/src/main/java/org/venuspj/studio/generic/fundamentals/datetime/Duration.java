package org.venuspj.studio.generic.fundamentals.datetime;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
