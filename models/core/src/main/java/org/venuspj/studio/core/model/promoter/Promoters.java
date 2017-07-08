package org.venuspj.studio.core.model.promoter;

import org.venuspj.util.list.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class Promoters {

    List<Promoter> list = Lists2.newArrayList();

    Promoters() {

    }

    public Promoters(List<Promoter> aList) {
        list.addAll(aList);

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    public static Promoters empty() {
        return new Promoters();
    }
}
