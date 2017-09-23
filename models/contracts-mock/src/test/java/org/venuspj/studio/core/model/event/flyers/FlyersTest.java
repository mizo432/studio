package org.venuspj.studio.core.model.event.flyers;

import org.junit.Test;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class FlyersTest {


    @Test
    public void testToString1() throws Exception {
        Flyers target = new Flyers();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Flyers target = FlyersMock.createDummy(FlyersMock.FlyersType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
