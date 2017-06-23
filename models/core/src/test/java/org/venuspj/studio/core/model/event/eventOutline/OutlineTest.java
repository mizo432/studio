package org.venuspj.studio.core.model.event.eventOutline;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.address.AddressTest;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studo.generic.fundamentals.datetime.DateProvider;
import org.venuspj.studo.generic.fundamentals.datetime.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class OutlineTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OutlineTest.class);

    @Test
    public void testToString1() throws Exception {
        Outline target = new Outline();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017,6,20,18,30,1,1));
        Outline target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    public static Outline createDummy() {
        return new Outline(DateProvider.currentDate(), AddressTest.createDummy(), PlayerIds.empty());
    }


}