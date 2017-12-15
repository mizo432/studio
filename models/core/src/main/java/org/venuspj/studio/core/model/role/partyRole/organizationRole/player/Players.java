package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.EntityIdentifiers;
import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.studio.generic.model.ppt.party.Party;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Players implements ListValue<Player> {
    List<Player> list = newArrayList();

    Players() {
    }

    public Players(Collection<? extends Player> anyCollection) {
        list.addAll(anyCollection);
    }

    public static Players empty() {
        return new Players();
    }

    public Players selectStudioPlayers() {
        List<Player> resultList = newArrayList();
        for (Player player : list)
            if (player.isStudioPlayer())
                resultList.add(player);

        return new Players(resultList);
    }

    public Integer playerSize() {
        return list.size();
    }

    @Override
    public List<Player> asList() {
        return unmodifiableList(list);

    }

    @Override
    public Iterator<Player> iterator() {
        return list.iterator();
    }


    public EntityIdentifiers<Party> identifiers() {
        return null;

    }
}
