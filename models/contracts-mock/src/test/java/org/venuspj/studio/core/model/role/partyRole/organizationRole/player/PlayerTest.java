package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PlayerTest {

    @Test
    public void testToString1() throws Exception {
        Player target = new Player();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerType.DEEJEY1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isStudioPlayer() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerType.DEEJEY1);
        boolean actual = target.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }

}
