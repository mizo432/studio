package jp.or.venuspj.studio.core.model.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by kenichimizoguchi on 2017/01/20.
 */
public class EventImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventImplTest.class);

    public static class ToStringTest {
        @Test
        public void test01() throws Exception {

            EventImpl target = new EventImpl();
            assertThat(target.toString())
                    .isNotNull();

            LOGGER.debug(target.toString());

        }

    }
}