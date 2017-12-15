package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class PrefectureTest {


    public static Prefecture createDummy() {
        return Prefecture.defaultPrefecture();
    }

    @Test
    public void testToString1() throws Exception {
        Prefecture target = Prefecture.unknown;
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Prefecture target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}