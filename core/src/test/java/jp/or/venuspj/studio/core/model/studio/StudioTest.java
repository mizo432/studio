package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studo.generic.fundamentals.caption.Caption;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
@RunWith(Enclosed.class)
public class StudioTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudioTest.class);

    public static class EqualsTest {

        @Test
        public void test01() throws Exception {
            StudioId studioId = new StudioId(10);
            Caption caption = new Caption("Lion House Studio");
            Studio target = new StudioBuilder()
                    .withEntityIdentifier(studioId)
                    .withCaption(caption)
                    .build();
            LOGGER.debug("target:" + target);
            assertThat(target.equals(target)).isTrue();
        }

        @Test
        public void test02() throws Exception {
            StudioId studioId = new StudioId(10);
            Caption caption = new Caption("Lion House Studio");
            Studio target = new StudioBuilder()
                    .withEntityIdentifier(studioId)
                    .withCaption(caption)
                    .build();
            assertThat(target
                    .equals(new Studio(new StudioId(11), caption)))
                    .isFalse();
        }

    }
}