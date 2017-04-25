package jp.or.venuspj.studio.core.fundamentals.moment;

import jp.or.venuspj.studio.core.fundamentals.dateTime.DateTime;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Objects;

/**
 * Created by mizoguchi on 2017/04/18.
 */
public class Moment {
    DateTime value;

    Moment() {

    }

    public Moment(DateTime aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean isEmpty() {
        return Objects.isNull(value);

    }
}
