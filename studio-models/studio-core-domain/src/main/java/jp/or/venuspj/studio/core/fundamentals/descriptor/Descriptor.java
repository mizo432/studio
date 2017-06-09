package jp.or.venuspj.studio.core.fundamentals.descriptor;

import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.studo.generic.fundamentals.description.Description;
import jp.or.venuspj.util.objects2.Objects2;

public class Descriptor {
    Name name;
    Description description;

    public Descriptor(Name aName, Description aDescription) {
        name = aName;
        description = aDescription;

    }

    Descriptor() {
        name = Name.defaultName();
        description = Description.emptyDescription();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("name", name)
                .add("description", description)
                .omitNullValues()
                .toString();

    }

    public static Descriptor defaultDescriptor() {
        return new Descriptor();
    }
}
