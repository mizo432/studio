package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class PartyPlaceThingTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PartyPlaceThingTest.class);


    public static PartyPlaceThing createDummy() {
        return new PartyPlaceThing(PartyPlaceThingIdTest.createDummy(), new Name("ANSA"));
    }

    @Test
    public void testToString1() throws Exception {
        PartyPlaceThing target = new PartyPlaceThing();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        PartyPlaceThing target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

}
