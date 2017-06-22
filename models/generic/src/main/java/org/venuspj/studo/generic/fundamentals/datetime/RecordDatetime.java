package org.venuspj.studo.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

public class RecordDatetime implements Value, DecidableSameValueAs<RecordDatetime> {
    private LocalDateTime value;

    public RecordDatetime() {

    }

    public RecordDatetime(LocalDateTime aValue) {
        value = aValue;

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
    public boolean sameValueAs(RecordDatetime other) {
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
}