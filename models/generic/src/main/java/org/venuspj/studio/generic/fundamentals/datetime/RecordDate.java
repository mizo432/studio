package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.LocalDate;

public class RecordDate implements Value, DecidableSameValueAs<RecordDate> {
    private LocalDate value;

    RecordDate() {
    }

    public RecordDate(LocalDate aValue) {
        value = aValue;

    }

    public LocalDate asDate() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public boolean sameValueAs(RecordDate other) {
        return Objects2.nonNull(other) && Objects2.equal(value, other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public static RecordDate empty() {
        return new RecordDate();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        RecordDate that;
        if (obj instanceof RecordDate) {
            that = (RecordDate) obj;
            if (Objects2.equal(value, that.value)) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }
}
