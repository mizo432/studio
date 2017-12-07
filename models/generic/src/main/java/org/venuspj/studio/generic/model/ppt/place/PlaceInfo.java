package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class PlaceInfo {
    Name name;
    Address address;

    public PlaceInfo(Name aName, Address anAddress) {
        name = aName;
        address = anAddress;

    }

    public static PlaceInfo empty() {
        return new PlaceInfo(Name.emptyName(), Address.nullAddress());
    }

}
