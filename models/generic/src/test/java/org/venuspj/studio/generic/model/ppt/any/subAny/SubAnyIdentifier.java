package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

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

}
