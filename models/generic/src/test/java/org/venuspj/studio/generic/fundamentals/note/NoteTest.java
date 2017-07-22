package org.venuspj.studio.generic.fundamentals.note;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class NoteTest {
    @Test
    public void empty() throws Exception {
        Note target = Note.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void toString1() throws Exception {
        Note target = new Note();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Note{}");
    }

}