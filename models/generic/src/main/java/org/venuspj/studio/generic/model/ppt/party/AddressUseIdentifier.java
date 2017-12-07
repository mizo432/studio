package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class AddressUseIdentifier extends AbstractEntityIdentifier<AddressUse> {
    private final Integer value;

    AddressUseIdentifier() {
        super(AddressUse.class);
        value = null;
    }

    public AddressUseIdentifier(Integer aValue) {
        super(AddressUse.class);
        value = aValue;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
