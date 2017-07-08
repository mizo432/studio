package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.LocalTime;

public class RecordTime implements Value, DecidableSameValueAs<RecordTime> {
    private LocalTime value;

    RecordTime() {

    }

    public RecordTime(LocalTime aValue) {
        value = aValue;

    }

    public LocalTime asTime() {
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
    public boolean sameValueAs(RecordTime other) {
        return Objects2.nonNull(other) &&
                Objects2.equal(value, other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects2.isNull(value))
            return false;
        if (obj instanceof RecordTime) {
            RecordTime other = (RecordTime) obj;
            return sameValueAs(other);
        }
        return false;
    }

    public static RecordTime empty() {
        return new RecordTime();
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }
}
