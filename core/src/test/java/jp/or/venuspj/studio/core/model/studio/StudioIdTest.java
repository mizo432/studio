package jp.or.venuspj.studio.core.model.studio;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by mizoguchi on 2017/03/25.
 */
@RunWith(Enclosed.class)
public class StudioIdTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudioIdTest.class);

    public static class EqualsTest {

        @Test
        public void test01() throws Exception {
            StudioId target = new StudioId(10);
            LOGGER.debug("target:" + target);
            assertThat(target.equals(target)).isTrue();
        }

        @Test
        public void test02() throws Exception {
            StudioId target = new StudioId(10);
            assertThat(target.equals(new StudioId(11))).isFalse();
        }

    }
}