package org.venuspj.studio.core.model.momentInterval.momemt.event.flyers;

import org.junit.Test;
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/model/event/flyers/FlyersTest.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;
import org.venuspj.util.collect.Lists2;
=======
import org.venuspj.util.dateProvider.StaticDateProvider;
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/model/momentInterval/momemt/event/flyers/FlyersTest.java

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
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/model/event/flyers/FlyersTest.java
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Flyers target = createDummy();
=======
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Flyers target = FlyersMock.createDummy(FlyersMock.FlyersType.DEFAULT);
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/model/momentInterval/momemt/event/flyers/FlyersTest.java
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
