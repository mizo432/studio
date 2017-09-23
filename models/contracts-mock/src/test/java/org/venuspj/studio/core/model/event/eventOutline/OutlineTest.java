package org.venuspj.studio.core.model.event.eventOutline;

import org.junit.Test;
import org.venuspj.studio.core.model.momentInterval.momemt.event.OutlineMock;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class OutlineTest {


    @Test
    public void testToString1() throws Exception {
        Outline target = new Outline();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Outline target = OutlineMock.createDummy(OutlineMock.OutlineType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }


}