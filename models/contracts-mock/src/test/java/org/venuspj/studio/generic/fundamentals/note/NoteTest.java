package org.venuspj.studio.generic.fundamentals.note;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NoteTest {

    @Test
    public void empty() throws Exception {
        Note target = Note.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}