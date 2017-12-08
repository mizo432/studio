package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.isNull;

public class OrganizationUnitImpl extends OrganizationImpl implements OrganizationUnit {
    public Organization getOrganization() {
        return organization;
    }

    public OrganizationUnits getLargerUnits() {
        return largerUnits;
    }

    public OrganizationUnits getSmallerUnits() {
        return smallerUnits;
    }

    // relations
    private final Organization organization;
    private final OrganizationUnits largerUnits;
    private final OrganizationUnits smallerUnits;

    public OrganizationUnitImpl() {
        super(PartyIdentifier.newId(), OrganizationUnitInformation.empty(),
                OrganizationUnits.empty());
        organization = OrganizationImpl.empty();
        largerUnits = OrganizationUnits.empty();
        smallerUnits = OrganizationUnits.empty();

    }

    public OrganizationUnitImpl(PartyIdentifier anIdentifier, OrganizationUnitInformation anOrganizationUnitInfo, Organization anOrganization, OrganizationUnits anyLargerUnits, OrganizationUnits anySmallerUnits, OrganizationUnits anyUnits) {
        super(anIdentifier, anOrganizationUnitInfo, anyUnits);
        organization = anOrganization;
        smallerUnits = anySmallerUnits;
        largerUnits = anyLargerUnits;
    }

    @Override
    public boolean equals(Object that) {
        return super.equals(that);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean sameValueAs(OrganizationUnitImpl that){
        if (isNull(that)) return false;
        return super.sameValueAs(that) &&
                equal(organization, that.getOrganization()) &&
                equal(largerUnits, that.getLargerUnits()) &&
                equal(smallerUnits, that.getSmallerUnits());

    }


    public static OrganizationUnit empty() {
        return new OrganizationUnitImpl();
    }

}
