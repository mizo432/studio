package org.venuspj.studio.generic.fundamentals.address.city;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class CitiesTest {

    public static Cities createDummy() {
        return Cities.empty();
    }

    @Test
    public void testToString1() throws Exception {
        Cities target = new Cities();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Cities target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}