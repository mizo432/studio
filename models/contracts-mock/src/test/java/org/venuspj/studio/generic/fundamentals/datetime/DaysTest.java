package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class DaysTest {
    @Test
    public void zero() throws Exception {
        Days target = Days.zero();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Days{0}");
        System.out.println(actual);

    }

    @Test
    public void asInteger() throws Exception {
        Days target = Days.zero();
        Integer actual = target.asInteger();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Integer.valueOf(0));
        System.out.println(actual);
    }

    @Test
    public void toString01() throws Exception {
        Days target = new Days(3);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Days{3}");
        System.out.println(actual);
    }
    @Test
    public void toString02() throws Exception {
        Days target = new Days();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Days{null}");
        System.out.println(actual);
    }

}