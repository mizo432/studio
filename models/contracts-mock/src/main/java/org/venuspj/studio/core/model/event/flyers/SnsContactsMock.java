package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.studio.core.fundamentals.snsContact.SnsContact;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContacts;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

/**
 */
public class SnsContactsMock {
    public static SnsContacts createDummy(SnsContactsType onlyHomePage) {
        List<SnsContact> list = newArrayList();
        return new SnsContacts(list);
    }

    public enum SnsContactsType {
        ONLY_HOME_PAGE, EMPTY

    }

}
