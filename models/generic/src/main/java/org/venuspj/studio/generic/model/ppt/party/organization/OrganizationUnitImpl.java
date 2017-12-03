package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class OrganizationUnitImpl extends OrganizationImpl implements OrganizationUnit {
    private final OrganizationUnitInfo unitInfo;

    // relations
    private final Organization organization;
    private final OrganizationUnits larger;
    private final OrganizationUnits smaller;

    public OrganizationUnitImpl() {
        super(PartyIdentifier.newId(), OrganizationUnitInfo.empty(),
                OrganizationUnits.empty());
        unitInfo = OrganizationUnitInfo.empty();
        organization = OrganizationImpl.empty();
        larger = OrganizationUnits.empty();
        smaller = OrganizationUnits.empty();

    }

    public OrganizationUnitImpl(PartyIdentifier anIdentifier, OrganizationUnitInfo anOrganizationUnitInfo, Organization anOrganization, OrganizationUnits anyLarger, OrganizationUnits anySmaller, OrganizationUnits anyUnits) {
        super(anIdentifier, anOrganizationUnitInfo, anyUnits);
        organization = anOrganization;
        unitInfo = anOrganizationUnitInfo;
        smaller = anySmaller;
        larger = anyLarger;
    }

    public static OrganizationUnit empty() {
        return new OrganizationUnitImpl();
    }

}
