package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

public class PlayerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTest.class);

    @Test
    public void testToString1() throws Exception {
        Player target = new Player();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerType.DEEJEY1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void isStudioPlayer() throws Exception {
        Player target = PlayerMock.createDummy(PlayerMock.PlayerType.DEEJEY1);
        boolean actual = target.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        LOGGER.debug("actual:" + target.toString());
    }

}
