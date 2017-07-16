package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.venuspj.util.objects2.Objects2;

public class PromoterId {

    private Integer value;

    PromoterId() {
    }

    public PromoterId(Integer aValue) {
        value = aValue;
    }

    public static PromoterId defaultEventId() {
        return new PromoterId();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
