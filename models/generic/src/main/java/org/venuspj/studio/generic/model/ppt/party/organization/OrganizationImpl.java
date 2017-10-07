package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;
import org.venuspj.util.builder.ObjectBuilder;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationImpl extends PartyImpl implements Organization {
    private final OrganizationInfo info;
    private final OrganizationUnits units;

    public OrganizationImpl(EntityIdentifier<Party> anIdentifier, OrganizationInfo anInfo, OrganizationUnits anyUnits) {
        super(anIdentifier, anInfo);
        info = anInfo;
        units = anyUnits;
    }

    public static Organization emptyOrganization() {
        return new OrganizationImpl(
                DefaultEntityIdentifier.newId(Party.class),
                OrganizationInfo.emptyOrganizationInfo(),
                OrganizationUnits.emptyOrganizationUnits()
        );
    }

    @Override
    public Organization clone() {
        Organization b = null;

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Organization) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
        //        return new OrganizationBuilder().apply(this);
    }

    @Override
    public OrganizationInfo getInfo() {
        return info;
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

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    private class OrganizationBuilder extends ObjectBuilder<Organization, OrganizationBuilder> {

        private EntityIdentifier<Party> identifier;
        private OrganizationInfo info;
        private OrganizationUnits units;

        @Override
        protected void apply(Organization vo, OrganizationBuilder builder) {
            builder.withIdentifier(vo.identifier());
            builder.withInfo(vo.getInfo());
            builder.withUnits(vo.getUnits());

        }

        public OrganizationBuilder withUnits(OrganizationUnits anUnits) {
            if (isNull(anUnits)) return getThis();
            addConfigurator(builder -> builder.units = anUnits);
            return getThis();

        }

        public OrganizationBuilder withInfo(OrganizationInfo anInfo) {
            if (isNull(anInfo)) return getThis();
            addConfigurator(builder -> builder.info = anInfo);
            return getThis();

        }

        public OrganizationBuilder withIdentifier(EntityIdentifier<Party> anIdentifier) {
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
