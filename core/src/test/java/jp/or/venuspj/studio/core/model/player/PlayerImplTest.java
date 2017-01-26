package jp.or.venuspj.studio.core.model.player;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class PlayerImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerImplTest.class);

    public static class ToStringTest {


        @Test
        public void test01() {
            Player target = new PlayerBuilder().build();
            assertThat(target.toString()).isNotNull();
            LOGGER.debug(target.toString());

        }

    }

}