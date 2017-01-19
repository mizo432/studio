package jp.or.venuspj.studo.general.fundamentals.datetime;

import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalTime;

public class RecordTime {
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
}
