package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.Iterator;
import java.util.List;

public class PlayerIds implements Iterable<EntityIdentifier<Player>> {
    List<EntityIdentifier<Player>> list = Lists2.newArrayList();

    PlayerIds() {
    }

    public PlayerIds(List<EntityIdentifier<Player>> aList) {
        list.addAll(aList);
    }

    public static PlayerIds empty() {
        return new PlayerIds();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    @Override
    public Iterator<EntityIdentifier<Player>> iterator() {
        return list.iterator();
    }
}
