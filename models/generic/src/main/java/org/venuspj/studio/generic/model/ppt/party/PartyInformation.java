package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PptInformation;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyInformation extends PptInformation {
    private AddressUse addressUse;
    private Name name;

    protected PartyInformation() {
        addressUse = new AddressUse.Builder().build();
        name = Name.empty();

    }

    public PartyInformation(Name aName, AddressUse anAddressUse) {
        name = aName;
        addressUse = anAddressUse;


    }

    public static PartyInformation empty() {
        return new PartyInformation();
    }

    public AddressUse getAddressUse() {
        return addressUse;
    }

    public Name getName() {
        return name;
    }

    public static abstract class Builder<P extends PartyInformation, B extends Builder<P, B>> extends PptInformation.Builder<P, B> {
        protected AddressUse addressUse;
        protected Name name;

        @Override
        protected void apply(P vo, B builder) {
            super.apply(vo, builder);
            builder.withAddressUse(vo.getAddressUse());
            builder.withName(vo.getName());

        }

        public B withAddressUse(AddressUse anAddressUse) {
            if (isNull(anAddressUse)) return getThis();
            addConfigurator(builder -> builder.addressUse = anAddressUse);
            return getThis();
        }

        public B withName(Name aName) {
            if (isNull(aName)) return getThis();
            addConfigurator(builder -> builder.name = aName);
            return getThis();
        }

    }

}
