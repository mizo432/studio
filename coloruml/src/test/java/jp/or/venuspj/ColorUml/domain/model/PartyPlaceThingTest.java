package jp.or.venuspj.ColorUml.domain.model;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.place.Address;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.PartyPlaceThingBuilder;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.SerialNumber;
import jp.or.venuspj.util.objects2.Objects2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


/**
 */
public class PartyPlaceThingTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PartyPlaceThingTest.class);


    public static class ToStringTest {
        @Test
        public void test01() throws Exception {
            PartyPlaceThing target = new PartyPlaceThingBuilder().build();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

        @Test
        public void test02() throws Exception {
            PartyPlaceThing target = PartyPlaceThingTest.createDummy();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

    }

    public static PartyPlaceThing createDummy() {
        return new PartyPlaceThingBuilder()
                .withSerialNumber(new SerialNumber(10))
                .withName(new Name() {
                    @Override
                    public String toString() {
                        return Objects2
                                .toStringHelper(this)
                                .toString();
                    }
                })
                .withAddress(new Address() {
                    @Override
                    public String toString() {
                        return Objects2
                                .toStringHelper(this)
                                .toString();
                    }
                })
                .build();

    }
}