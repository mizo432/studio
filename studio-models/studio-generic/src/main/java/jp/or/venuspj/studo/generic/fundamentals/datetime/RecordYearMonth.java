package jp.or.venuspj.studo.generic.fundamentals.datetime;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

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

}
