package org.venuspj.studio.core.model.player;

import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.studio.core.model.studio.StudioCode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PlayerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTest.class);

    @Test
    public void testToString1() throws Exception {
        Player target = new Player();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Player{playerId=PlayerId{studioCode=StudioCode{}, playerCode=PlayerCode{null}}, name=Name{null}}");
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PlayerId playerId = new PlayerId(new StudioCode("LHS"),new PlayerCode("ANSA"));
        Name name = new Name("ANSA");
        Player target = new Player(playerId, name);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Player{playerId=PlayerId{studioCode=StudioCode{LHS}, playerCode=PlayerCode{ANSA}}, name=Name{ANSA}}");
        LOGGER.debug("actual:" + target.toString());
    }

}
