package org.venuspj.util.strings2;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class Strings2Test {
    public static class IsEmptyTest {
        @Test
        public void test01() throws Exception {
            String arg = "";
            boolean actual = Strings2.isEmpty(arg);
            assertThat(actual)
                    .isTrue();

        }

        @Test
        public void test02() throws Exception {
            String arg = "";
            boolean actual = Strings2.isEmpty(arg);
            assertThat(actual)
                    .isTrue();

        }

        @Test
        public void test03() throws Exception {
            String arg = "A";
            boolean actual = Strings2.isEmpty(arg);
            assertThat(actual)
                    .isFalse();

        }
    }

    public static class IsNotEmptyTest {
        @Test
        public void test01() throws Exception {
            String arg = "";
            boolean actual = Strings2.isNotEmpty(arg);
            assertThat(actual)
                    .isFalse();

        }

        @Test
        public void test02() throws Exception {
            String arg = "";
            boolean actual = Strings2.isNotEmpty(arg);
            assertThat(actual)
                    .isFalse();

        }

        @Test
        public void test03() throws Exception {
            String arg = "A";
            boolean actual = Strings2.isNotEmpty(arg);
            assertThat(actual)
                    .isTrue();

        }
    }


    public static class IsTestTest {
        @Test
        public void test01() throws Exception {
            String arg = "";
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isFalse();
        }

        @Test
        public void test02() throws Exception {
            String arg = "1";
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isTrue();
        }

        @Test
        public void test03() throws Exception {
            String arg = " 1";
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isFalse();
        }

        @Test
        public void test04() throws Exception {
            String arg = "3 ";
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isFalse();
        }

        @Test
        public void test05() throws Exception {
            String arg = String.valueOf(Integer.MIN_VALUE);
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isTrue();
        }

        @Test
        public void test06() throws Exception {
            String arg = String.valueOf(Integer.MAX_VALUE);
            boolean actual = Strings2.isNumber(arg);
            assertThat(actual)
                    .isTrue();
        }

    }


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
