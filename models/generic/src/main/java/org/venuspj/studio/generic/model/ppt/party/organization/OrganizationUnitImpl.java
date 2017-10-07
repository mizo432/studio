package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationUnitImpl extends PartyImpl implements OrganizationUnit {
    private final OrganizationUnitInfo unitInfo;

    // relations
    private final Organization organization;
    private final OrganizationUnits larger;
    private final OrganizationUnits smaller;

    public OrganizationUnitImpl(EntityIdentifier<Party> anIdentifier, OrganizationUnitInfo anOrganizationUnitInfo, Organization anOrganization, OrganizationUnits anyLarger, OrganizationUnits anySmaller) {
        super(anIdentifier, anOrganizationUnitInfo);
        organization = anOrganization;
        unitInfo = anOrganizationUnitInfo;
        smaller = anySmaller;
        larger = anyLarger;
    }

    public static OrganizationUnit emptyOrganizationUnit() {
        return new OrganizationUnitImpl(
                DefaultEntityIdentifier.newId(Party.class)
                , OrganizationUnitInfo.emptyUnitInfo()
                , OrganizationImpl.emptyOrganization()
                , OrganizationUnits.emptyOrganizationUnits()
                , OrganizationUnits.emptyOrganizationUnits()

        );
    }


    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("identifier", identifier())
                .add("unitInfo", unitInfo);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
