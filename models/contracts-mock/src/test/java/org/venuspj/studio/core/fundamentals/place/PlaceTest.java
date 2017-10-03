package org.venuspj.studio.core.fundamentals.place;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

@Deprecated
public class PlaceTest {

    @Test
    public void testToString1() throws Exception {
        Place target = new Place();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Place target = PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }
}
