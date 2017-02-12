package jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval;

import com.google.common.collect.ComparisonChain;
import jp.or.venuspj.ddd.model.value.DateValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDate;

/**
 */
public class RecordDate implements DateOrDatetimeOrInterval, DateValue, Comparable<RecordDate> {
    private LocalDate value;

    RecordDate() {
    }

    public RecordDate(LocalDate aValue) {
        value = aValue;
    }

    @Override
    public LocalDate asDate() {
        return value;
    }

    @Override
    public int compareTo(RecordDate o) {
        return ComparisonChain
                .start()
                .compare(value, o.value)
                .result();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
