package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

import static org.venuspj.util.objects2.Objects2.*;

@SuppressWarnings("EQ_SELF_NO_OBJECT")
public class OrganizationImpl extends PartyImpl implements Organization {
    private final OrganizationUnitIdentifiers unitsIdentifiers;

    public OrganizationImpl(PartyIdentifier anIdentifier, OrganizationInformation anInfo, OrganizationUnitIdentifiers anyUnitsIdentifiers) {
        super(anIdentifier, anInfo);
        unitsIdentifiers = anyUnitsIdentifiers;
    }

    public static Organization empty() {
        return new OrganizationImpl(
                PartyIdentifier.newId(),
                OrganizationInformation.empty(),
                OrganizationUnitIdentifiers.empty()
        );
    }

    @Override
    public Organization clone() {
        Organization b = new OrganizationImpl(
                (PartyIdentifier) identifier(),
                getOrganizationInformation(),
                unitsIdentifiers
        );

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Organization) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public OrganizationInformation getOrganizationInformation() {
        return (OrganizationInformation) super.getPartyInformation();
    }

    @Override
    public boolean equals(Object that) {
        return super.equals(that);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public OrganizationUnitIdentifiers getUnitIdentifiers() {
        return unitsIdentifiers;
    }

    public boolean sameValueAs(OrganizationImpl that) {
        if (isNull(that)) return false;
        return super.sameValueAs(that) &&
                equal(unitsIdentifiers, that.getUnitIdentifiers());

    }

    public static class Builder extends PartyImpl.Builder<OrganizationImpl, Builder> {

        private OrganizationInformation organizationInformation = OrganizationInformation.empty();
        private OrganizationUnitIdentifiers unitIdentifiers = OrganizationUnitIdentifiers.empty();

        @Override
        protected void apply(OrganizationImpl vo, Builder builder) {
            super.apply(vo, builder);
            builder.withOrganizationInformation(vo.getOrganizationInformation());
            builder.withUnitIdentifiers(vo.getUnitIdentifiers());

        }

        private Builder withUnitIdentifiers(OrganizationUnitIdentifiers anyUnitIdentifiers) {
            if (isNull(anyUnitIdentifiers)) return getThis();
            addConfigurator(builder -> builder.unitIdentifiers = anyUnitIdentifiers);
            return getThis();
        }

        public Builder withOrganizationInformation(OrganizationInformation anOrganizationInformation) {
            if (isNull(anOrganizationInformation)) return getThis();
            addConfigurator(builder -> builder.organizationInformation = anOrganizationInformation);
            return getThis();
        }

        @Override
        protected OrganizationImpl createValueObject() {
            return new OrganizationImpl(identifier, organizationInformation, unitIdentifiers);
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
