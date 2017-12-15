package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationUnitImpl extends PartyImpl implements OrganizationUnit {
    // relations
    private final Organization organization;
    private final OrganizationUnitIdentifiers largerUnitIdentifiers;
    private final OrganizationUnitIdentifiers smallerUnitIdentifiers;

    public OrganizationUnitImpl() {
        super(PartyIdentifier.newId(), OrganizationUnitInformation.empty());
        organization = OrganizationImpl.empty();
        largerUnitIdentifiers = OrganizationUnitIdentifiers.empty();
        smallerUnitIdentifiers = OrganizationUnitIdentifiers.empty();

    }

    public OrganizationUnitImpl(PartyIdentifier anIdentifier, OrganizationUnitInformation anOrganizationUnitInfo, Organization anOrganization, OrganizationUnitIdentifiers anylargerUnitIdentifiers,
                                OrganizationUnitIdentifiers anySmallerUnitIdentifiers) {
        super(anIdentifier, anOrganizationUnitInfo);
        organization = anOrganization;
        largerUnitIdentifiers = anylargerUnitIdentifiers;
        smallerUnitIdentifiers = anySmallerUnitIdentifiers;
    }

    public static OrganizationUnit empty() {
        return new OrganizationUnitImpl();
    }

    public Organization getOrganization() {
        return organization;
    }

    public OrganizationUnitIdentifiers getLargerUnitIdentifiers() {
        return largerUnitIdentifiers;
    }

    public OrganizationUnitIdentifiers getSmallerUnitIdentifiers() {
        return smallerUnitIdentifiers;
    }

    public OrganizationUnitInformation getOrganizationUnitInformation() {
        return (OrganizationUnitInformation) super.getPartyInformation();
    }

    @Override
    public boolean equals(Object that) {
        return super.equals(that);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean sameValueAs(OrganizationUnitImpl that) {
        if (isNull(that)) return false;
        return super.sameValueAs(that) &&
                equal(organization, that.getOrganization()) &&
                equal(largerUnitIdentifiers, that.getLargerUnitIdentifiers()) &&
                equal(smallerUnitIdentifiers, that.getSmallerUnitIdentifiers());

    }

    public static class Builder extends PartyImpl.Builder<OrganizationUnitImpl, Builder> {

        private Organization organization = OrganizationImpl.empty();
        private OrganizationUnitInformation organizationUnitInformation = OrganizationUnitInformation.empty();
        private OrganizationUnitIdentifiers largerUnitIdentifiers = OrganizationUnitIdentifiers.empty();
        private OrganizationUnitIdentifiers smallerUnitIdentifiers = OrganizationUnitIdentifiers.empty();

        @Override
        protected void apply(OrganizationUnitImpl vo, Builder builder) {
            super.apply(vo, builder);
            builder.withOrganization(vo.getOrganization());
            builder.withOrganizationUnitInformation(vo.getOrganizationUnitInformation());
            builder.withLargerUnitIdentifiers(vo.getLargerUnitIdentifiers());
            builder.withSmallerUnitIdentifiers(vo.getSmallerUnitIdentifiers());

        }

        public Builder withSmallerUnitIdentifiers(OrganizationUnitIdentifiers anySmallerUnitIdentifiers) {
            if (isNull(anySmallerUnitIdentifiers)) return getThis();
            addConfigurator(builder -> builder.smallerUnitIdentifiers = anySmallerUnitIdentifiers);
            return getThis();
        }

        public Builder withLargerUnitIdentifiers(OrganizationUnitIdentifiers anyLargerUnitIdentifiers) {
            if (isNull(anyLargerUnitIdentifiers)) return getThis();
            addConfigurator(builder -> builder.largerUnitIdentifiers = anyLargerUnitIdentifiers);
            return getThis();
        }

        public Builder withOrganizationUnitInformation(OrganizationUnitInformation anOrganizationUnitInformation) {
            if (isNull(anOrganizationUnitInformation)) return getThis();
            addConfigurator(builder -> builder.organizationUnitInformation = anOrganizationUnitInformation);
            return getThis();
        }

        public Builder withOrganization(Organization anOrganization) {
            if (isNull(anOrganization)) return getThis();
            addConfigurator(builder -> builder.organization = anOrganization);
            return getThis();
        }

        @Override
        protected OrganizationUnitImpl createValueObject() {
            return new OrganizationUnitImpl(identifier, organizationUnitInformation, organization, largerUnitIdentifiers, smallerUnitIdentifiers);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }

}
