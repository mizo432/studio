package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.YearMonth;

public class RecordYearMonth implements Value, DecidableSameValueAs<RecordYearMonth> {
    private YearMonth value;

    RecordYearMonth() {

    }

    public RecordYearMonth(YearMonth aValue) {
        value = aValue;

    }

    public YearMonth asYearMonth() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean sameValueAs(RecordYearMonth other) {
        return Objects2.nonNull(other) && value.equals(other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public static RecordYearMonth empty() {
        return new RecordYearMonth();
    }
}
