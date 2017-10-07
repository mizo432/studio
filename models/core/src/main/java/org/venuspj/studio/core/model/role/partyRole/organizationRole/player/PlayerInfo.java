package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

/**
 * プレイヤー 組織の役割
 */
public class PlayerInfo {

    private final Name name;

    PlayerInfo() {
        name = Name.emptyName();

    }

    public PlayerInfo(Name aName) {
        name = aName;
    }

    public static PlayerInfo emptyPlayerInfo() {
        return new PlayerInfo(Name.emptyName());
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("name", name)
                .omitNullValues()
                .toString();
    }

}
