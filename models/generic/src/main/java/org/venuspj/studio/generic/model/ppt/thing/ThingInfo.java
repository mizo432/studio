package org.venuspj.studio.generic.model.ppt.thing;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingInfo {
    public ThingInfo() {

    }

    public static ThingInfo emptyThingInfo() {
        return new ThingInfo();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .omitNullValues()
                .toString();
    }
}
