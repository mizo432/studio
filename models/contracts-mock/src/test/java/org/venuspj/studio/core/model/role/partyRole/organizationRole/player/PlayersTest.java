package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PlayersTest {

    @Test
    public void empty() throws Exception {
        Players target =
                Players.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }


    @Test
    public void testToString1() throws Exception {
        Players target = new Players();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void toString2() throws Exception {
        Players target = PlayersMock.createDummy(PlayersMock.PlayersMockType.ONE_DEEJEY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void selectStudioPlayers() throws Exception {
        Players target = PlayersMock.createDummy(PlayersMock.PlayersMockType.ANY_PLAYERS);
        Players actual = target.selectStudioPlayers();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
        assertThat(actual.playerSize())
                .isNotNull()
                .isEqualTo(4);
    }

    @Test
    public void asList() throws Exception {
        Players target = PlayersMock.createDummy(PlayersMock.PlayersMockType.ALL_PLAYERS);
        List<Player> actual = target.asList();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
        assertThat(actual.size())
                .isNotNull()
                .isEqualTo(6);

    }
}