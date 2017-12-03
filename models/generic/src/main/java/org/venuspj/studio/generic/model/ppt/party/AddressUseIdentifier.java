package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class AddressUseIdentifier extends AbstractEntityIdentifier<AddressUse> {
    @Override
    public boolean isEmpty() {
        return false;
    }
}
