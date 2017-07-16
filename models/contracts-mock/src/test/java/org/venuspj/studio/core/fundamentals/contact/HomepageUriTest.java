package org.venuspj.studio.core.fundamentals.contact;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class HomepageUriTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomepageUriTest.class);

    public static HomepageUri createDummy() {
        return new HomepageUri(URI.create("https://lionhousestudio.com"));
    }

    @Test
    public void testToString1() throws Exception {
        HomepageUri target = new HomepageUri();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        HomepageUri target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void asText() throws Exception {
        HomepageUri target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());

    }

}