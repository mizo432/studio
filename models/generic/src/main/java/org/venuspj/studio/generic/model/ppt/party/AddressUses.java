package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

/**
 * パーティーの所在の割り当て
 */
public class AddressUses extends AbstractListValue<AddressUse> {

    public AddressUses(Collection<? extends AddressUse> anyAddressUses) {
        super(anyAddressUses);

    }

}
