package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.venuspj.util.objects2.Objects2.*;

public class PlaceInfo {
    Name name;
    Address address;

    public PlaceInfo(Name aName, Address anAddress) {
        name = aName;
        address = anAddress;

    }

    public static PlaceInfo emptyPlaceInfo() {
        return new PlaceInfo(Name.emptyName(), Address.nullAddress());
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("name", name)
                .add("address", address)
                .omitNullValues()
                .toString();
    }

}
