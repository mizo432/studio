package jp.or.venuspj.studio.core.fundamentals.dateTime;

import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

/**
 * Created by mizoguchi on 2017/04/18.
 */
public class DateTime {

    LocalDateTime value;

    DateTime() {

    }

    public DateTime(LocalDateTime aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

}
