package org.venuspj.todox.core.model.sprint;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;

import java.util.List;

public class SprintIds {
    List<EntityIdentifier<SprintId>> list = Lists2.newArrayList();

    public SprintIds(List<SprintId> alist) {
        list.addAll(list);
    }

    private SprintIds() {
    }

    public static SprintIds empty() {
        return new SprintIds();
    }
}
