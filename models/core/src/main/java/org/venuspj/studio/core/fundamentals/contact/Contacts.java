package org.venuspj.studio.core.fundamentals.contact;

import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class Contacts {
    List<Contact> list = Lists2.newArrayList();

    public Contacts(List<Contact> result) {
        list.addAll(result);
    }

    public Contacts() {

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
