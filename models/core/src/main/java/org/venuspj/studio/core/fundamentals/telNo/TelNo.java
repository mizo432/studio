package org.venuspj.studio.core.fundamentals.telNo;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/06/23.
 */
public class TelNo implements StringValue {

    private String value;

    public TelNo(String aValue) {
        value = aValue;
    }

    TelNo() {

    }

    public static TelNo emptyTelNo() {
        return new TelNo();
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .omitNullValues()
                .toString();
    }
}
