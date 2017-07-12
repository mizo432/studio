package org.venuspj.studio.core.fundamentals.snsContact;

import org.venuspj.util.list2.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class SnsContacts {
    List<SnsContact> list = Lists2.newArrayList();

    SnsContacts() {
    }

    SnsContacts(List<SnsContact> aList) {
        list.addAll(aList);
    }

    public static SnsContacts emptySnsContacts() {
        return new SnsContacts();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
