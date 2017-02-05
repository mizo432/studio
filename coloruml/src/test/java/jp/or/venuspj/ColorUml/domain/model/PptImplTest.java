package jp.or.venuspj.ColorUml.domain.model;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Place.Address;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.PptBuilder;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.SerialNumber;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


/**
 */
public class PptImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PptImplTest.class);

    public static <PPT extends Ppt<PPT>> PPT createDummy() {
        return (PPT) new PptBuilder()
                .withSerialNumber(new SerialNumber(10))
                .withName(new Name() {
                })
                .withAddress(new Address() {
                })
                .build();

    }

    public static class ToStringTest {
        @Test
        public void test01() throws Exception {
            Ppt target = new PptBuilder().build();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

        @Test
        public void test02() throws Exception {
            Ppt target = PptImplTest.createDummy();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

    }
}