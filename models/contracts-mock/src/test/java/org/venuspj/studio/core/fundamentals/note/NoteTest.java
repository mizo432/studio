package org.venuspj.studio.core.fundamentals.note;

import org.junit.Test;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

@Deprecated
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
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Note target = NoteMock.createDummy(NoteMock.NoteType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void asText() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Note target = NoteMock.createDummy(NoteMock.NoteType.DEFAULT);
        String actual = target.asText();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}
