package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PlayerTest {

    @Test
    public void isStudioPlayer1() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerMockType.DEEJEY1);
        System.out.println("target:" + toStringHelper(target).defaultConfig().toString());
        boolean actual = target.isStudioPlayer();
//        assertThat(actual)
//                .isNotNull()
//                .isTrue();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isStudioPlayer2() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerMockType.OUTER_BAND1);
        boolean actual = target.isStudioPlayer();
//        assertThat(actual)
//                .isNotNull()
//                .isFalse();
        System.out.println("actual:" + actual);
    }

}
