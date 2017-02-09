package jp.or.venuspj.ColorUml.domain.model;

import jp.or.venuspj.ColorUml.domain.model.role.RoleBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kenichimizoguchi on 2017/02/09.
 */
public class RoleTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleTest.class);
    public static class BuilderText {

        @Test
        public void test01() {
            Role actual = RoleTest.createDummy();
            LOGGER.debug("actual:" + actual);

        }

    }

    public static Role createDummy() {
        return new RoleBuilder()
                .withAssignedNumber(10)
                .withPartyPlaceThing(PartyPlaceThingTest.createDummy())
                .withMomentIntervals(MomentIntervalsTest.createDummyData())
                .build();
    }

}