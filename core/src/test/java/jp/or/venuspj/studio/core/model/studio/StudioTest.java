package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.PartyPlaceThingBuilder;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.thing.ThingBuilder;
import jp.or.venuspj.studo.general.fundamentals.name.NamePair;
import jp.or.venuspj.studo.general.fundamentals.name.SimpleName;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class StudioTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudioTest.class);

    public static class ToStringTest {
        @Test
        public void test01() throws Exception {
            Studio target = StudioTest.createDummy();
            String actual = target.toString();
            LOGGER.debug("actual:" + actual);

        }

    }

    public static Studio createDummy() {
        return new StudioBuilder()
                .withThing(new ThingBuilder()
                        .withPartyPlaceThing(new PartyPlaceThingBuilder()
                                .withSerialNumber(1)
                                .withName(
                                        new NamePair(
                                                new SimpleName("Lino House Studio"),
                                                new SimpleName("Lion House")
                                        )
                                )
                                .build())
                        .build())
                .withEntityIdentifier(new StudioIdentifier(new StudioId(1)))
                .build();
    }
}