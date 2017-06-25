package org.venuspj.studio.core.fundamentals.address.prefecture;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Prefecture implements StringValue {
    PrefectureCode prefectureCode;
    private String value;

    Prefecture() {
    }

    public Prefecture(PrefectureCode aPrefectureCode, String aValue) {
        value = aValue;
        prefectureCode = aPrefectureCode;
    }

    public static Prefecture defaultPrefecture() {
        return new Prefecture(new PrefectureCode(14), "神奈川県");
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("code", prefectureCode)
                .add("name", value)
                .toString();
    }

}
