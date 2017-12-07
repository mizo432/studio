package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;
import org.venuspj.util.builder.ObjectBuilder;
import org.venuspj.util.objects2.Objects2;

import static java.awt.SystemColor.info;
import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationImpl extends PartyImpl implements Organization {
    private final OrganizationUnits units;

    public OrganizationImpl(PartyIdentifier anIdentifier, OrganizationInformation anInfo, OrganizationUnits anyUnits) {
        super(anIdentifier, anInfo);
        units = anyUnits;
    }

    public static Organization empty() {
        return new OrganizationImpl(
                PartyIdentifier.newId(),
                OrganizationInformation.empty(),
                OrganizationUnits.empty()
        );
    }

    @Override
    public Organization clone() {
        Organization b = new OrganizationImpl(
                (PartyIdentifier) identifier(),
                getOrganizationInformation(),
                units
        );

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Organization) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public OrganizationInformation getOrganizationInformation() {
        return (OrganizationInformation) super.getPartyInformation();
    }

    @Override
    public OrganizationUnits getUnits() {
        return units;
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("identifier", identifier())
                .add("info", info);
    }

    private class OrganizationBuilder extends ObjectBuilder<Organization, OrganizationBuilder> {

        private PartyIdentifier identifier;
        private OrganizationInformation info;
        private OrganizationUnits units = OrganizationUnits.empty();

        @Override
        protected void apply(Organization vo, OrganizationBuilder builder) {
            builder.withIdentifier((PartyIdentifier) vo.identifier());
            builder.withInfo(vo.getOrganizationInformation());
            builder.withUnits(vo.getUnits());

        }

        public OrganizationBuilder withUnits(OrganizationUnits anUnits) {
            if (isNull(anUnits)) return getThis();
            addConfigurator(builder -> builder.units = anUnits);
            return getThis();

        }

        public OrganizationBuilder withInfo(OrganizationInformation anInfo) {
            if (isNull(anInfo)) return getThis();
            addConfigurator(builder -> builder.info = anInfo);
            return getThis();

        }

        public OrganizationBuilder withIdentifier(PartyIdentifier anIdentifier) {
            if (isNull(anIdentifier)) return getThis();
            addConfigurator(builder -> builder.identifier = anIdentifier);
            return getThis();
        }

        @Override
        protected OrganizationImpl createValueObject() {
            return new OrganizationImpl(identifier, info, units);
        }

        @Override
        protected OrganizationBuilder getThis() {
            return this;
        }

        @Override
        protected OrganizationBuilder newInstance() {
            return new OrganizationBuilder();
        }
    }

}
