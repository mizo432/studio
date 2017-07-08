package org.venuspj.studio.core.model.studio;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class StudioCode extends AbstractEntityIdentifier<Studio> {
    String value;

    StudioCode() {
        this("");
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind",kind)
                .add("studioCode",value)
                .toString();
    }

    public StudioCode(String aValue) {
        super(Studio.class);
        value = aValue;
    }

    public static StudioCode defaultCode() {
        return new StudioCode("");
    }

    @Override
    public int hashCode() {
        return Objects2.hash(kind, value);
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        if (!(obj instanceof StudioCode))
            return false;
        StudioCode that = (StudioCode) obj;
        return Objects2.equal(value, that.value);
    }

}
