package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.AddressUse;

public class OrganizationUnitInformation extends OrganizationInformation {
    private OrganizationUnitInformation() {
        super(new AddressUse.Builder().build());

    }

    public OrganizationUnitInformation(AddressUse anAddressUse) {
        super(anAddressUse);
    }

    public static OrganizationUnitInformation empty() {
        return new OrganizationUnitInformation();
    }
}
