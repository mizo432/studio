package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Roles;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Place.Address;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class PptBuilder extends ObjectBuilder<Ppt, PptBuilder> {
    private SerialNumber serialNumber;
    private Name name;
    private Address address;
    private Roles roles;
    private Description description;

    @Override
    protected void apply(Ppt vo, PptBuilder builder) {
        PptImpl concreteVo = (PptImpl) vo;
        builder.withSerialNumber(concreteVo.serialNumber);
        builder.withName(concreteVo.name);
        builder.withAddress(concreteVo.address);
        builder.withRoles(concreteVo.roles);
        builder.withDescription(concreteVo.description);

    }
    public PptBuilder withAddress(Address anAddress) {
        if (Objects2.isNull(anAddress)) return getThis();
        addConfigurator(builder -> builder.address = anAddress);
        return getThis();
    }

    public PptBuilder withName(Name aName) {
        if (Objects2.isNull(aName)) return getThis();
        addConfigurator(builder -> builder.name = aName);
        return getThis();
    }

    public PptBuilder withDescription(Description aDescription) {
        if (Objects2.isNull(aDescription)) return getThis();
        addConfigurator(builder -> builder.description = aDescription);
        return getThis();
    }

    public PptBuilder withRoles(Roles aRoles) {
        if (Objects2.isNull(aRoles)) return getThis();
        addConfigurator(builder -> builder.roles = aRoles);
        return getThis();
    }

    public PptBuilder withSerialNumber(SerialNumber aSerialNumber) {
        if (Objects2.isNull(aSerialNumber)) return getThis();
        addConfigurator(builder -> builder.serialNumber = aSerialNumber);
        return getThis();
    }

    @Override
    protected Ppt createValueObject() {
        return new PptImpl(serialNumber, name, address, roles, description);
    }

    @Override
    protected PptBuilder getThis() {
        return this;
    }

    @Override
    protected PptBuilder newInstance() {
        return new PptBuilder();
    }
}
