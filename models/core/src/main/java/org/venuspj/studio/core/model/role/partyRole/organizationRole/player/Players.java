package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitId;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitIds;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Players implements ListValue<Player>, Iterable<Player> {

    List<Player> list = Lists2.newArrayList();

    Players() {
    }

    public Players(Iterable<Player> aList) {
        Lists2.addAll(list, aList);
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
        for (OrganizationUnit organizationUnit : list) {
            if (((Player) organizationUnit).isStudioPlayer())
                resultList.add(new Player(organizationUnit, ((Player) organizationUnit).playerClassification));

        }
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


    public OrganizationUnitIds identifiers() {
        List<OrganizationUnitId> result = newArrayList();

        for (Player player : list)
            result.add(player.identifier());

        return new OrganizationUnitIds(result);
    }
}
