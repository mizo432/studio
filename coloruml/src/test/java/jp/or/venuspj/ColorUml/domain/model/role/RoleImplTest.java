package jp.or.venuspj.ColorUml.domain.model.role;

import jp.or.venuspj.ColorUml.domain.model.PptImplTest;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.ColorUml.domain.model.momentInterval.MomentIntervalsImplTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class RoleImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleImplTest.class);
    public static class ToStringTest {
        @Test
        public void test01() throws Exception {
            Role target = new RoleBuilder<>().build();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

        @Test
        public void test02() throws Exception {
            Role target = new RoleBuilder<>()
                    .withAssignedNumber(10)
                    .withPartyPlaceThing(PptImplTest.createDummy())
                    .withMomentIntervals(MomentIntervalsImplTest.createDummy())
                    .build();
            LOGGER.info("target:" + target);
            assertThat(target)
                    .isNotNull();

        }

    }
}