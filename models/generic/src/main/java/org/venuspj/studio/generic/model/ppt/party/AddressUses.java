package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntities;

import java.util.Collection;

/**
 * パーティーの所在の割り当て
 */
public class AddressUses extends AbstractEntities<AddressUse> {

    public AddressUses(Collection<? extends AddressUse> anyAddressUses) {
        super(anyAddressUses);

    }


}
