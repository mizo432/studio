package org.venuspj.studio.core.fundamentals.descriptor;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class Descriptor {
    Name name;
    Description description;

    public Descriptor(Name aName, Description aDescription) {
        name = aName;
        description = aDescription;

    }

    Descriptor() {
        name = Name.defaultName();
        description = Description.empty();
    }

    public static Descriptor defaultDescriptor() {
        return new Descriptor();
    }

    public static Descriptor emptyDescriptor() {
        return new Descriptor(Name.empty(), Description.empty());
    }

    public Name getName() {
        return name;
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
}
