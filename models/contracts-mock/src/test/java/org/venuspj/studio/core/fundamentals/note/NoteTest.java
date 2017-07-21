package org.venuspj.studio.core.fundamentals.note;

import org.junit.Test;
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/fundamentals/note/NoteTest.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;
=======
import org.venuspj.util.dateProvider.StaticDateProvider;
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/fundamentals/note/NoteTest.java

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class NoteTest {

    @Test
    public void testToString1() throws Exception {
        Note target = new Note();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/fundamentals/note/NoteTest.java
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Note target = createDummy();
=======
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Note target = NoteMock.createDummy(NoteMock.NoteType.DEFAULT);
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/fundamentals/note/NoteTest.java
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}
