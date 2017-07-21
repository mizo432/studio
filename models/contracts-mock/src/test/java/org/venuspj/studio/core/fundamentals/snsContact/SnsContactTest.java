package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class SnsContactTest {

    public static SnsContact createDummy() {
        return new SnsContact(SnsKind.TWITTER, SnsIdTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        SnsContact target = new SnsContact();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        SnsContact target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}