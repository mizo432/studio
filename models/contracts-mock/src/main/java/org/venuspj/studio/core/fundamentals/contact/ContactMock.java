package org.venuspj.studio.core.fundamentals.contact;

import org.venuspj.studio.core.fundamentals.telNo.TelNoMock;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class ContactMock {

    public static Contact createDummy(ContactType aContactType) {
        if (ContactType.EMPTY == aContactType)
            return Contact.emptyContact();
        return new Contact(TelNoMock.createDummy(TelNoMock.TelNoType.EXISTS_NUMBER),
                TelNoMock.createDummy(TelNoMock.TelNoType.EMPTY),
                HomepageUriMock.createDummy(HomepageUriMock.HomepageUriType.DEFAULT));
    }

    public enum ContactType {
        DEFAULT, EMPTY

    }
}
