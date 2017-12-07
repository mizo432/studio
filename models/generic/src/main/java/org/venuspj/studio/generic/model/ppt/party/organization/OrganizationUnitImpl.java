package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class OrganizationUnitImpl extends OrganizationImpl implements OrganizationUnit {
    // relations
    private final Organization organization;
    private final OrganizationUnits larger;
    private final OrganizationUnits smaller;

    public OrganizationUnitImpl() {
        super(PartyIdentifier.newId(), OrganizationUnitInformation.empty(),
                OrganizationUnits.empty());
        organization = OrganizationImpl.empty();
        larger = OrganizationUnits.empty();
        smaller = OrganizationUnits.empty();

    }

    public OrganizationUnitImpl(PartyIdentifier anIdentifier, OrganizationUnitInformation anOrganizationUnitInfo, Organization anOrganization, OrganizationUnits anyLarger, OrganizationUnits anySmaller, OrganizationUnits anyUnits) {
        super(anIdentifier, anOrganizationUnitInfo, anyUnits);
        organization = anOrganization;
        smaller = anySmaller;
        larger = anyLarger;
    }

    public static OrganizationUnit empty() {
        return new OrganizationUnitImpl();
    }

}
