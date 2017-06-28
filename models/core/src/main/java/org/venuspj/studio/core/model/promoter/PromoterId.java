package org.venuspj.studio.core.model.promoter;

import org.venuspj.util.objects2.Objects2;

public class PromoterId {

    private Integer value;

    PromoterId() {
    }

    public PromoterId(Integer aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public static PromoterId defaultEventId() {
        return new PromoterId();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
