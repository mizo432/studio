package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.fundamentals.contact.Contact;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class ContactMock {

    public static Contact createDummy(ContactType empty) {
        return Contact.emptyContact();
    }

    public enum ContactType {
        EMPTY

    }
}
