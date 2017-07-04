package org.venuspj.util.strings2;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Strings2Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Strings2Test.class);

    @Test
    public void repeat1() throws Exception {
        String actual = Strings2.repeat("1", 1);
        assertThat(actual).isNotNull().isEqualTo("1");

    }

    @Test
    public void repeat2() throws Exception {
        String actual = Strings2.repeat("12", 1);
        assertThat(actual).isNotNull().isEqualTo("12");

    }

    @Test
    public void repeat3() throws Exception {
        String actual = Strings2.repeat("12", 3);
        assertThat(actual).isNotNull().isEqualTo("121212");

    }
}
