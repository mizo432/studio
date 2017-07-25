package org.venuspj.studio.core.fundamentals.contact;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class ContactsMock {
    public static Contacts createDummy(ContactsType aContactsType) {
        ContactMock.ContactType[] contactTypes = aContactsType.contactTypes();
        List<Contact> result = Lists2.newArrayListWithCapacity(contactTypes.length);
        for (ContactMock.ContactType contactType:contactTypes) {
            result.add(ContactMock.createDummy(contactType));
        }
        return new Contacts(result);
    }

    public enum ContactsType {EMPTY {
        @Override
        public ContactMock.ContactType[] contactTypes() {
            return new ContactMock.ContactType[0];
        }
    },DEFAULT {
        @Override
        public ContactMock.ContactType[] contactTypes() {
            return new ContactMock.ContactType[]{ContactMock.ContactType.DEFAULT};
        }
    };

        public abstract ContactMock.ContactType[] contactTypes();
    }
}
