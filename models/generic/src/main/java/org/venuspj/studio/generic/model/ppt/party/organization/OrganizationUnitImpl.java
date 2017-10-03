package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationUnitImpl extends AbstractEntity<OrganizationUnit> implements Entity<OrganizationUnit>, OrganizationUnit {
    private final OrganizationUnitId organizationUnitId;
    private final OrganizationUnitInfo unitInfo;

    // relations
    private final Organization organization;
    private final OrganizationUnits larger;
    private final OrganizationUnits smaller;

    public OrganizationUnitImpl(OrganizationUnitId anIdentifier, OrganizationUnitInfo anOrganizationUnitInfo, Organization anOrganization, OrganizationUnits anylarger, OrganizationUnits anySmaller) {
        super(anIdentifier);
        organizationUnitId = anIdentifier;
        organization = anOrganization;
        unitInfo = anOrganizationUnitInfo;
        smaller = anySmaller;
        larger = anylarger;
    }

    public static OrganizationUnit emptyOrganizationUnit() {
        return new OrganizationUnitImpl(
                OrganizationUnitId.emptyOrganizationUnitId()
                , OrganizationUnitInfo.emptyUnitInfo()
                , OrganizationImpl.emptyOrganization()
                , OrganizationUnits.emptyOrganizationUnits()
                , OrganizationUnits.emptyOrganizationUnits()

        );
    }

    @Override
    public OrganizationUnitId identifier() {
        return (OrganizationUnitId) super.identifier();
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("organizationUnitId", organizationUnitId)
                .add("unitInfo", unitInfo);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
