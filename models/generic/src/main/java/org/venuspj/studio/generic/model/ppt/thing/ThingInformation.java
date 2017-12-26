package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PptInformation;

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
}
