package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyPlaceThingImpl<PPTI extends PartyPlaceThing<PPTI>> extends AbstractEntity<PPTI> implements PartyPlaceThing<PPTI> {

    protected PptInfo pptInfo;

    public PartyPlaceThingImpl(EntityIdentifier<PPTI> anIdentifier, PptInfo aPptInfo) {
        super(anIdentifier);
        pptInfo = aPptInfo;
    }

    @Override
    public int hashCode() {
        return identifier().hashCode();
    }

    @Override
    public boolean equals(Object that) {
        return nonNull(that) &&
                (this == that ||
                        (that instanceof PartyPlaceThingImpl &&
                                (equal(((PartyPlaceThingImpl) that).identifier(), identifier()))));
    }

    public <PPT extends PartyPlaceThing> Boolean sameIdentifierAs(PPT aPartyPlaceThing) {
        return equals(aPartyPlaceThing);

    }
}
