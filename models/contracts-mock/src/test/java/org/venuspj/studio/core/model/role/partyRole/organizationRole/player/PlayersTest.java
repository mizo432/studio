package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

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
    public void testToString2() throws Exception {
        Players target = PlayersMock.createDummy(PlayersMock.PlayersType.ONE_DEEJEY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void selectStudioPlayers() throws Exception {
        Players target = PlayersMock.createDummy(PlayersMock.PlayersType.ONE_DEEJEY);
        Players actual = target.selectStudioPlayers();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.playerSize())
                .isNotNull()
                .isEqualTo(1);
        System.out.println("actual:" + actual);
    }

}