package org.venuspj.studio.core.model.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.studio.core.model.studio.StudioCode;

import static org.assertj.core.api.Java6Assertions.*;

public class PlayerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTest.class);

    public static Player createDummy() {
        PlayerId playerId = new PlayerId(new StudioCode("LHS"), new PlayerCode("ANSA"));
        Name name = new Name("ANSA");
        return new Player(playerId, name);

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

}
