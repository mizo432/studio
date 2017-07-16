package org.venuspj.studio.core.model.momentInterval.momemt.event;

import com.google.common.collect.Lists;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContact;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContacts;

import java.util.List;

/**
 */
public class SnsContactsMock {
    public static SnsContacts createDummy(SnsContactsType onlyHomePage) {
        List<SnsContact> list = Lists.newArrayList();
        return new SnsContacts(list);
    }

    public enum SnsContactsType {
        ONLY_HOME_PAGE, EMPTY

    }

}
