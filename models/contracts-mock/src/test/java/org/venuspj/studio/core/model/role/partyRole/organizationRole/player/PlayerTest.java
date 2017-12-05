package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PlayerTest {

    @Test
    public void toString1() throws Exception {
        Player target = new Player();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void toString2() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerMockType.DEEJEY1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isStudioPlayer1() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerMockType.DEEJEY1);
        boolean actual = target.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isStudioPlayer2() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerMockType.OUTER_BAND1);
        boolean actual = target.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }

}
