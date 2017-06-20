package jp.or.venuspj.studo.generic.fundamentals.datetime;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

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
}
