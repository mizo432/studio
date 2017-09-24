package org.venuspj.studio.core.fundamentals.place;

import org.venuspj.studio.core.fundamentals.contact.Contact;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContacts;
import org.venuspj.studio.generic.fundamentals.address.Address;

import static org.venuspj.util.objects2.Objects2.*;

public class Place {

    Descriptor descriptor;

    Address address;

    Contact contact;

    SnsContacts snsContacts = SnsContacts.emptySnsContacts();

    Place() {

    }

    public Place(Descriptor aDescriptor, Address anAddress, Contact aContact, SnsContacts aSnsContacts) {
        descriptor = aDescriptor;
        address = anAddress;
        contact = aContact;
        snsContacts = aSnsContacts;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("descriptor", descriptor)
                .add("address", address)
                .add("contact", contact)
                .add("snsContacts", snsContacts)
                .omitNullValues()
                .toString();
    }
}
