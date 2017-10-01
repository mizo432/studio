package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitId;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitImpl;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public abstract class OrganizationRoleImpl extends PartyRoleImpl<OrganizationUnit>
        implements OrganizationUnit, OrganizationRole<OrganizationUnit> {
    private final OrganizationUnit organizationUnit;

    protected OrganizationRoleImpl() {
        super();
        organizationUnit = OrganizationUnitImpl.emptyOrganizationUnit();
    }

    public OrganizationRoleImpl(OrganizationUnit anOrganizationUnit) {
        super(anOrganizationUnit);
        organizationUnit = anOrganizationUnit;
    }

    @Override
    public OrganizationUnitId identifier() {
        return organizationUnit.identifier();
    }

    public OrganizationUnit getOrganizationUnit() {
        return organizationUnit;
    }
}
