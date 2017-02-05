package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetail;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetails;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class MomentIntervalImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MomentIntervalImplTest.class);

    public static class ToStringTest {

        @Test
        public void test01() throws Exception {
            MomentInterval target = new MomentIntervalBuilder<>().build();
            LOGGER.info("target" + target.toString());
            assertThat(target).isNotNull();

        }

        @Test
        public void test02() throws Exception {
            MomentInterval target = MomentIntervalImplTest.createDummy();
            LOGGER.info("target" + target.toString());
            assertThat(target).isNotNull();


        }

    }

    public static <MI extends MomentInterval<MI>, MID extends MomentIntervalDetail<MID>> MI createDummy() {
        return new MomentIntervalBuilder<MI, MID>()
                .withDateOrDatetimeOrInterval(new DateOrDatetimeOrInterval() {
                })
                .withMomentIntervalDetails(new MomentIntervalDetails<MID>() {
                    @Override
                    public List<MID> asList() {
                        return Lists.newArrayList();
                    }
                })
                .build();
    }
}