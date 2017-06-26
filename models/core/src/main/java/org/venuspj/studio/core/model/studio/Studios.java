package org.venuspj.studio.core.model.studio;

import org.venuspj.util.list2.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class Studios {
    List<Studio> list = Lists2.newArrayList();

    Studios() {

    }

    public Studios(List<Studio> aList) {
        list.addAll(aList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    public static Studios empty() {
        return new Studios();
    }
}
