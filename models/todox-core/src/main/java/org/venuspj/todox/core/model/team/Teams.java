package org.venuspj.todox.core.model.team;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;

import java.util.List;
import java.util.Map;

import static org.venuspj.util.collect.Maps2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class Teams {
    List<Team> list = Lists2.newArrayList();

    public Teams(List<Team> alist) {
        list.addAll(list);
    }

    private Teams() {
    }

    public static Teams empty() {
        return new Teams();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    public Map<EntityIdentifier<Team>, Team> asMap() {
        Map<EntityIdentifier<Team>, Team> result = newHashMap();
        for (Team element : list)
            result.put(element.identifier(), element);
        return result;
    }

}
