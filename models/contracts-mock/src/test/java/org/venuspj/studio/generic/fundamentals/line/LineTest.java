package org.venuspj.studio.generic.fundamentals.line;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class LineTest {
    @Test
    public void empty() throws Exception {
        Line target = Line.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}
