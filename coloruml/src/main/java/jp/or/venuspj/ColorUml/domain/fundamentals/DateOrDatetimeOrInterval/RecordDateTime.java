package jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval;

import com.google.common.collect.ComparisonChain;
import jp.or.venuspj.ddd.model.value.DateTimeValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

/**
 */
public class RecordDateTime implements DateOrDatetimeOrInterval, DateTimeValue, Comparable<RecordDateTime> {
    private LocalDateTime value;

    RecordDateTime() {
    }

    public RecordDateTime(LocalDateTime aValue) {
        value = aValue;
    }

    @Override
    public LocalDateTime asDateTime() {
        return value;
    }

    @Override
    public int compareTo(RecordDateTime o) {
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
