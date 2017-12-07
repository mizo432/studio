package org.venuspj.studio.generic.model.ppt.thing;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingInformation {
    public ThingInformation() {

    }

    public static ThingInformation empty() {
        return new ThingInformation();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .omitNullValues()
                .toString();
    }
}
