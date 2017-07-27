package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class PrefectureCodeTest {

    public static PrefectureCode createDummy() {
        return new PrefectureCode(12);
    }

    @Test
    public void testToString1() throws Exception {
        PrefectureCode target = new PrefectureCode();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        PrefectureCode target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void asText() throws Exception {
        PrefectureCode target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("12");
    }

    @Test
    public void asInteger() throws Exception {
        PrefectureCode target = createDummy();
        Integer actual = target.asInteger();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(12);
    }

}