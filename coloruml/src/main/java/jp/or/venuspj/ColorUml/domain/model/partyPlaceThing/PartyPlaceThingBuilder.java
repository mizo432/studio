package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.ColorUml.domain.model.Roles;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.place.Address;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class PartyPlaceThingBuilder extends ObjectBuilder<PartyPlaceThing, PartyPlaceThingBuilder> {
    private SerialNumber serialNumber;
    private Name name;
    private Address address;
    private Roles roles;
    private Description description;

    @Override
    protected void apply(PartyPlaceThing vo, PartyPlaceThingBuilder builder) {
        PartyPlaceThingImpl concreteVo = (PartyPlaceThingImpl) vo;
        builder.withSerialNumber(concreteVo.serialNumber);
        builder.withName(concreteVo.name);
        builder.withAddress(concreteVo.address);
        builder.withRoles(concreteVo.roles);
        builder.withDescription(concreteVo.description);

    }

    public PartyPlaceThingBuilder withAddress(Address anAddress) {
        if (Objects2.isNull(anAddress)) return getThis();
        addConfigurator(builder -> builder.address = anAddress);
        return getThis();
    }

    public PartyPlaceThingBuilder withName(Name aName) {
        if (Objects2.isNull(aName)) return getThis();
        addConfigurator(builder -> builder.name = aName);
        return getThis();
    }

    public PartyPlaceThingBuilder withDescription(Description aDescription) {
        if (Objects2.isNull(aDescription)) return getThis();
        addConfigurator(builder -> builder.description = aDescription);
        return getThis();
    }

    public PartyPlaceThingBuilder withRoles(Roles aRoles) {
        if (Objects2.isNull(aRoles)) return getThis();
        addConfigurator(builder -> builder.roles = aRoles);
        return getThis();
    }

    public PartyPlaceThingBuilder withSerialNumber(SerialNumber aSerialNumber) {
        if (Objects2.isNull(aSerialNumber)) return getThis();
        addConfigurator(builder -> builder.serialNumber = aSerialNumber);
        return getThis();
    }

    @Override
    protected PartyPlaceThing createValueObject() {
        return new PartyPlaceThingImpl(serialNumber, name, address, roles, description);
    }

    @Override
    protected PartyPlaceThingBuilder getThis() {
        return this;
    }

    @Override
    protected PartyPlaceThingBuilder newInstance() {
        return new PartyPlaceThingBuilder();
    }

    public PartyPlaceThingBuilder withSerialNumber(Integer aSerialNumber) {
        if (Objects2.isNull(aSerialNumber)) return getThis();
        addConfigurator(builder -> builder.serialNumber = new SerialNumber(aSerialNumber));
        return getThis();
    }
}
