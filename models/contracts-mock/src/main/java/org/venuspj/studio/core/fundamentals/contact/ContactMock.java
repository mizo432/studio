package org.venuspj.studio.core.fundamentals.contact;

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
