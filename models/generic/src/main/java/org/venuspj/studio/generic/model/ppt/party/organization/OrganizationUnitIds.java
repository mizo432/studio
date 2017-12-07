package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

import java.util.Collection;

public class OrganizationUnitIds extends AbstractListValue<PartyIdentifier> {


    OrganizationUnitIds() {
        super();

    }

    public OrganizationUnitIds(Collection<? extends PartyIdentifier> anyCollection) {
        super(anyCollection);

    }

    public static OrganizationUnitIds empty() {
        return new OrganizationUnitIds();
    }

}
