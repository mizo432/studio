package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PptInformation;

public class PlaceInformation extends PptInformation {
    protected Name name;

    protected Address address;

    public PlaceInformation(Name aName, Address anAddress) {
        name = aName;
        address = anAddress;

    }

    public static PlaceInformation empty() {
        return new PlaceInformation(Name.empty(), Address.nullAddress());
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }


}
