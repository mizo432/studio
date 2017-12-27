package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PptInformation;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

public class ThingInformation extends PptInformation {
    Name name = Name.empty();

    public ThingInformation() {

    }

    public ThingInformation(Name aName) {
        name = aName;

    }

    public static ThingInformation empty() {
        return new ThingInformation();
    }

    public Name getName() {
        return name;
    }

    public static class Builder extends ObjectBuilder<ThingInformation, Builder> {

        Name name = Name.empty();

        @Override
        protected void apply(ThingInformation vo, Builder builder) {
            builder.withName(vo.getName());

        }

        public Builder withName(Name aName) {
            if (isNull(aName)) return getThis();
            addConfigurator(builder -> builder.name = aName);
            return getThis();
        }

        @Override
        protected ThingInformation createValueObject() {
            return new ThingInformation(name);
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
