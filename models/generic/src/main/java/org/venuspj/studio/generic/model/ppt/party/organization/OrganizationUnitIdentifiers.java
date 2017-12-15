package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

import java.util.Collection;

public class OrganizationUnitIdentifiers extends AbstractListValue<PartyIdentifier> {


    OrganizationUnitIdentifiers() {
        super();

    }

    public OrganizationUnitIdentifiers(Collection<? extends PartyIdentifier> anyCollection) {
        super(anyCollection);

    }

    public static OrganizationUnitIdentifiers empty() {
        return new OrganizationUnitIdentifiers();
    }

}
