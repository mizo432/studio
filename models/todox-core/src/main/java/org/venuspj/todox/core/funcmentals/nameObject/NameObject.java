package org.venuspj.todox.core.funcmentals.nameObject;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.venuspj.util.objects2.Objects2.*;

public class NameObject {

    Name name;
    Description description;

    public NameObject(Name aName, Description aDescription) {
        name = aName;
        description = aDescription;
    }

    public static NameObject defaultNameObject() {
        return new NameObject(Name.defaultName(), Description.emptyDescription());
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("name", name)
                .add("description", description)
                .omitNullValues()
                .toString();
    }

    public boolean isPresent() {
        return name.isPresent() || description.isPresent();
    }
}
