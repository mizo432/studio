package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class SubAnyIdentifier<SA extends SubAny<SA>> extends AbstractEntityIdentifier<SA> {
    private final Integer value;

    SubAnyIdentifier() {
        super(SubAnyIdentifier.class);
        value = null;
    }

    public SubAnyIdentifier(Integer aValue) {
        super(SubAnyIdentifier.class);
        value = aValue;

    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }
}
