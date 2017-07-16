package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PlayerIdTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerIdTest.class);

    public static PlayerId createDummy() {
        return new PlayerId(new StudioCode("LHS"), new PlayerCode("ANSA"));

    }

    @Test
    public void defaultId() throws Exception {
        PlayerId target = PlayerId.defaultId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString1() throws Exception {
        PlayerId target = new PlayerId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PlayerId target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
}
