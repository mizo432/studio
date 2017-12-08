package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.isNull;
import static org.venuspj.util.objects2.Objects2.nonNull;

public class PartyPlaceThingImpl<PPT extends PartyPlaceThing<PPT>> extends AbstractEntity<PPT> implements PartyPlaceThing<PPT> {

    protected PptInformation pptInformation;

    public PartyPlaceThingImpl(EntityIdentifier<PPT> anIdentifier, PptInformation aPptInformation) {
        super(anIdentifier);
        pptInformation = aPptInformation;
    }

    @Override
    public int hashCode() {
        return identifier().hashCode();
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof PartyPlaceThingImpl && sameIdentifierAs((PartyPlaceThingImpl) that);
    }

    public <PPT extends PartyPlaceThing> Boolean sameIdentifierAs(PPT that) {
        return nonNull(that) && equal(identifier(), that.identifier());
    }

    protected PptInformation getPptInformation() {
        return pptInformation;
    }

    public boolean sameValueAs(PartyPlaceThingImpl that) {
        if (isNull(that)) return false;
        return sameIdentifierAs(that) && equal(pptInformation, that.getPptInformation());
    }
}
