package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studo.general.fundamentals.name.SimpleName;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public class StudioTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudioTest.class);
    public static class ToStringTest {
        @Test
        public void test01() throws Exception {
            Studio target = new StudioBuilder().withName(new SimpleName("LionHouseStudio")).build();
            String actual = target.toString();
            LOGGER.debug("actual:" + actual);


        }

    }
}