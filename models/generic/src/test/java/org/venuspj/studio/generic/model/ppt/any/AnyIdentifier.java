package org.venuspj.studio.generic.model.ppt.any;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class AnyIdentifier<A extends Any<A>> extends AbstractEntityIdentifier<A> {
    private final Integer value;

    AnyIdentifier() {
        super(AnyIdentifier.class);
        value = null;
    }

    AnyIdentifier(Integer aValue) {
        super(AnyIdentifier.class);
        value = aValue;

    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }
}
