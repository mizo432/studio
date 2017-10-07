package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifiers;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Players extends AbstractListValue<Player> {

    Players() {
    }

    public Players(Collection<? extends Player> aList) {
        super(aList);
    }

    public static Players empty() {
        return new Players();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    public Players selectStudioPlayers() {
        List<Player> resultList = Lists2.newArrayList();
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


    @SuppressWarnings(value = "unchecked")
    public DefaultEntityIdentifiers<Party> identifiers() {
        List<EntityIdentifier<Party>> result = newArrayList();

        for (Player player : list)
            result.add(player.identifier());

        return new DefaultEntityIdentifiers(result);
    }
}
