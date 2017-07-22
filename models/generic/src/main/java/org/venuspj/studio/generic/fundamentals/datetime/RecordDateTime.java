package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.dateProvider.DateProvider;
import org.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

public class RecordDateTime implements Value, DecidableSameValueAs<RecordDateTime> {
    private LocalDateTime value;

    public RecordDateTime() {

    }

    public RecordDateTime(LocalDateTime aValue) {
        value = aValue;

    }

    public static RecordDateTime now() {
        return new RecordDateTime(DateProvider.currentDateTime());
    }

    public static RecordDateTime empty() {
        return new RecordDateTime(DateProvider.currentDateTime());
    }

    public LocalDateTime asDateTime() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public boolean sameValueAs(RecordDateTime other) {
        return Objects2.nonNull(other) &&
                Objects2.equal(value, other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public RecordDate asDate() {
        return new RecordDate(value.toLocalDate());
    }

    public RecordTime asTime() {
        return new RecordTime(value.toLocalTime());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof RecordDateTime) {
            RecordDateTime that = (RecordDateTime) obj;
            return sameValueAs(that);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }
}
