package org.venuspj.studio.core.fundamentals.contact;

import org.junit.Test;

import java.net.URI;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class HomepageUriTest {

    public static HomepageUri createDummy() {
        return new HomepageUri(URI.create("https://lionhousestudio.com"));
    }

    @Test
    public void testToString1() throws Exception {
        HomepageUri target = new HomepageUri();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        HomepageUri target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void asText() throws Exception {
        HomepageUri target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());

    }

}