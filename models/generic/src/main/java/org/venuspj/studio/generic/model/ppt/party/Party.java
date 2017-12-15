package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;

/**
 * 人または組織.
 */
public interface Party extends PartyPlaceThing<Party>, Entity<Party> {

    AddressUse getCurrentAddressUse();

}
