package org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class SubSubAnyIdentifier extends AbstractEntityIdentifier<SubSubAny> {
    private final Integer value;

    SubSubAnyIdentifier() {
        super(SubSubAnyIdentifier.class);
        value = null;
    }

    public SubSubAnyIdentifier(Integer aValue) {
        super(SubSubAnyIdentifier.class);
        value = aValue;

    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }
}
