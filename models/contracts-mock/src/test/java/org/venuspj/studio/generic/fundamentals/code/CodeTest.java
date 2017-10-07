package org.venuspj.studio.generic.fundamentals.code;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class CodeTest {
    @Test
    public void asText() throws Exception {
        Code target = new Code("A");
        assertThat(target.asText())
                .isEqualTo("A");
    }

    @Test
    public void toString1() throws Exception {
        Code target = new Code("A");
        assertThat(target.toString())
                .isEqualTo("Code{A}");
    }

    @Test
    public void equals1() throws Exception {
        Code target = new Code("A");
        assertThat(target.equals(target))
                .isTrue();
    }

    @Test
    public void equals2() throws Exception {
        Code target = new Code("A");
        assertThat(target.equals(null))
                .isFalse();
    }

    @Test
    public void equals3() throws Exception {
        Code target = new Code("A");
        assertThat(target.equals(new Code("A")))
                .isTrue();
    }

    @Test
    public void equals4() throws Exception {
        Code target = new Code("A");
        assertThat(target.equals(new Code("B")))
                .isFalse();
    }

    @Test
    public void equals5() throws Exception {
        Code target = new Code("1");
        assertThat(target.equals(Integer.valueOf(1)))
                .isFalse();
    }

    @Test
    public void hashCode1() throws Exception {
        Code target = new Code("A");
        assertThat(target.hashCode())
                .isEqualTo(96);
    }

    @Test
    public void sameValueAs() throws Exception {
        Code target = new Code("A");
        assertThat(target.sameValueAs(target))
                .isTrue();

    }

}