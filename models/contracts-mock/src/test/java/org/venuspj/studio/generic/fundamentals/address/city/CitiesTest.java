package org.venuspj.studio.generic.fundamentals.address.city;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CitiesTest {
    @Test
    public void toString1() throws Exception {
        Cities target = CitiesMock.createDummy(CitiesMock.CitiesType.EMPTY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
    @Test
    public void toString2() throws Exception {
        Cities target = CitiesMock.createDummy(CitiesMock.CitiesType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
    @Test
    public void toString3() throws Exception {
        Cities target = new Cities();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
    @Test
    public void asList() throws Exception {
        Cities target = new Cities();
        List<City> actual = target.asList();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
