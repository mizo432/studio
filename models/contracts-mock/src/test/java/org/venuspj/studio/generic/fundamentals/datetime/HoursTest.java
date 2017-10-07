package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class HoursTest {
    @Test
    public void zero() throws Exception {
        Hours target = Hours.zero();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Hours{0}");
        System.out.println(actual);

    }

    @Test
    public void asInteger() throws Exception {
        Hours target = Hours.zero();
        Integer actual = target.asInteger();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Integer.valueOf(0));
        System.out.println(actual);
    }

    @Test
    public void toString01() throws Exception {
        Hours target = new Hours(3);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Hours{3}");
        System.out.println(actual);
    }
    @Test
    public void toString02() throws Exception {
        Hours target = new Hours();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Hours{null}");
        System.out.println(actual);
    }

}