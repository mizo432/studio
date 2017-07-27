package org.venuspj.studio.generic.fundamentals.caption;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CaptionTest {

    @Test
    public void testToString1() throws Exception {
        Caption target = new Caption();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Caption target = Caption.emptyCaption();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString3() throws Exception {
        Caption target = CaptionMock.createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void asText() throws Exception {
        Caption target = CaptionMock.createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("DUMMY_CAPTION");
        System.out.println("actual:" + actual);
    }
    @Test
    public void sameValueAs1() throws Exception {
        Caption target = CaptionMock.createDummy();
        Caption other = CaptionMock.createDummy();
        boolean actual = target.sameValueAs(other);
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }
    @Test
    public void sameValueAs2() throws Exception {
        Caption target = CaptionMock.createDummy();
        boolean actual = target.sameValueAs(target);
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }

    @Test
    public void sameValueAs3() throws Exception {
        Caption target = CaptionMock.createDummy();
        boolean actual = target.sameValueAs(null);
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }

    @Test
    public void sameValueAs4() throws Exception {
        Caption target = CaptionMock.createDummy();
        boolean actual = target.sameValueAs(Caption.emptyCaption());
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }
}
