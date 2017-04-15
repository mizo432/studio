package jp.or.venuspj.studo.generic.fundamentals.datetime;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

public class RecordDateTime implements Value, DecidableSameValueAs<RecordDateTime> {
    private LocalDateTime value;

    RecordDateTime() {

    }

    public RecordDateTime(LocalDateTime aValue) {
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
    public boolean sameValueAs(RecordDateTime other) {
        return Objects2.nonNull(other) &&
                Objects2.equal(value, other.value);
    }
}
