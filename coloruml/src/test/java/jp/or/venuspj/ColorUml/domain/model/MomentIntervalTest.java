package jp.or.venuspj.ColorUml.domain.model;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.ColorUml.domain.model.momentInterval.MomentIntervalBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class MomentIntervalTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MomentIntervalTest.class);

    public static class ToStringTest {

        @Test
        public void test01() throws Exception {
            MomentInterval target = new MomentIntervalBuilder().build();
            LOGGER.info("target" + target.toString());
            assertThat(target).isNotNull();

        }

        @Test
        public void test02() throws Exception {
            MomentInterval target = MomentIntervalTest.createDummy();
            LOGGER.info("target" + target.toString());
            assertThat(target).isNotNull();


        }

    }

    public static MomentInterval createDummy() {
        return new MomentIntervalBuilder()
                .withDateOrDatetimeOrInterval(new DateOrDatetimeOrInterval() {
                })
                .withMomentIntervalDetails(new MomentIntervalDetails() {
                    @Override
                    public List<MomentIntervalDetail> asList() {
                        return Lists.newArrayList();
                    }
                })
                .build();
    }
}