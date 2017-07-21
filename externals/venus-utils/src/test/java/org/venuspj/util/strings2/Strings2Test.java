package org.venuspj.util.strings2;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class Strings2Test {
    public static class RepeatTest {

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

        @Test
        public void repeat11() throws Exception {
            String actual = Strings2.repeat("1", 1, ", ");
            assertThat(actual).isNotNull().isEqualTo("1");

        }

        @Test
        public void repeat12() throws Exception {
            String actual = Strings2.repeat("12", 1, ", ");
            assertThat(actual).isNotNull().isEqualTo("12");

        }

        @Test
        public void repeat13() throws Exception {
            String actual = Strings2.repeat("12", 3, ", ");
            assertThat(actual).isNotNull().isEqualTo("12, 12, 12");

        }
    }
}
