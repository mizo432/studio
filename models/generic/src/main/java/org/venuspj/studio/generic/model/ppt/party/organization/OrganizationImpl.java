package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.util.builder.ObjectBuilder;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationImpl extends AbstractEntity<Organization> implements Entity<Organization>, Organization {
    private final OrganizationId organizationId;
    private final boolean isEmpty;
    private final OrganizationInfo info;
    private final OrganizationUnits units;

    public OrganizationImpl(OrganizationId anIdentifier, OrganizationInfo anInfo, OrganizationUnits anyUnits) {
        super(anIdentifier);
        isEmpty = !anIdentifier.isPresent();
        organizationId = anIdentifier;
        info = anInfo;
        units = anyUnits;
    }

    public static Organization emptyOrganization() {
        return new OrganizationImpl(
                OrganizationId.emptyOrganizationId(),
                OrganizationInfo.emptyOrganizationInfo(),
                OrganizationUnits.emptyOrganizationUnits()
        );
    }

    @Override
    public Organization clone() {
        try {
            return new OrganizationBuilder().apply(this);
        } catch (RuntimeException e) {
            return super.clone();
        }
    }

    @Override
    public OrganizationId identifier() {
        return organizationId;
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
                .add("organizationId", organizationId)
                .add("isEmpty", isEmpty)
                .add("info", info);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    private class OrganizationBuilder extends ObjectBuilder<Organization, OrganizationBuilder> {

        private OrganizationId identifier;
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

        public OrganizationBuilder withIdentifier(OrganizationId anIdentifier) {
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
