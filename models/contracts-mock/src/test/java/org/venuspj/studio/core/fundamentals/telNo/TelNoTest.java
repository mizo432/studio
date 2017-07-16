package org.venuspj.studio.core.fundamentals.telNo;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class TelNoTest {

    @Test
    public void testToString1() throws Exception {
        TelNo target = new TelNo();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        TelNo target = TelNoMock.createDummy(TelNoMock.TelNoType.EXISTS_NUMBER);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString3() throws Exception {
        TelNo target = TelNo.emptyTelNo();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString4() throws Exception {
        TelNo target = TelNoMock.createDummy(TelNoMock.TelNoType.EMPTY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}