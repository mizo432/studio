package org.venuspj.studio.core.model.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class StudioCode implements EntityIdentifier<Studio> {
    String value;

    StudioCode() {
        value = "";
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public StudioCode(String aValue) {
        value = aValue;
    }

    public static StudioCode defaultCode() {
        return new StudioCode("");
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StudioCode))
            return false;
        StudioCode that = (StudioCode) obj;
        return Objects2.equal(value, that.value);
    }

}
