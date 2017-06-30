package org.venuspj.studio.core.model.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.model.studio.StudioCode;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PlayerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTest.class);

    public static Player createDummy() {
        PlayerId playerId = new PlayerId(new StudioCode("LHS"), new PlayerCode("ANSA"));
        Name name = new Name("ANSA");
        return new Player(playerId, name, PlayerClassification.STUDIO_PLAYER);

    }

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
        Player target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void isStudioPlayer() throws Exception {
        Player target = createDummy();
        boolean actual = target.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        LOGGER.debug("actual:" + target.toString());
    }

}
