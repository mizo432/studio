package org.venuspj.studio.core.fundamentals.place;

import org.venuspj.studio.core.fundamentals.address.Address;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.util.objects2.Objects2;

public class Place {
    Descriptor descriptor;

    Address address;

    Place() {

    }

    public Place(Descriptor aDescriptor, Address anAddress) {
        descriptor = aDescriptor;
        address = anAddress;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("descriptor", descriptor)
                .add("address", address)
                .omitNullValues()
                .toString();
    }
}
