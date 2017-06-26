package org.venuspj.studio.core.model.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.list2.Lists2;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class PlayersTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayersTest.class);

    public static Players createDummy() {
        return new Players(Lists2.newArrayList(PlayerTest.createDummy()));
    }

    @Test
    public void empty() throws Exception {
        Players target =
                Players.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }


    @Test
    public void testToString1() throws Exception {
        Players target = new Players();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Players target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}