package org.venuspj.studio.core.model.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.list.Lists2;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PlayerIdsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerIdsTest.class);

    public static PlayerIds createDummy() {
        return new PlayerIds(Lists2.newArrayList(PlayerIdTest.createDummy()));
    }

    @Test
    public void empty() throws Exception {
        PlayerIds target =
                PlayerIds.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }


    @Test
    public void testToString1() throws Exception {
        PlayerIds target = new PlayerIds();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PlayerIds target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}