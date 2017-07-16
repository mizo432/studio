package org.venuspj.studio.core.model.momentInterval.momemt.event.flyers;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class FlyerTest {

    @Test
    public void testToString1() throws Exception {
        Flyer target = new Flyer();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Flyer target = FlyerMock.createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void emptyFlyer() throws Exception {
        Flyer target = Flyer.emptyFlyer();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
