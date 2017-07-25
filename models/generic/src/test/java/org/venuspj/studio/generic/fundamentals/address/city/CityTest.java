package org.venuspj.studio.generic.fundamentals.address.city;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class CityTest {

    public static City createDummy() {
        return City.defaultCity();
    }

    @Test
    public void testToString1() throws Exception {
        City target = new City();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        City target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
    @Test
    public void asText() throws Exception {
        City target = new City();
        String actual = target.asText();
        assertThat(actual)
                .isNull();
        System.out.println("actual:" + actual);
    }
}