package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;

/**
 */
public class SnsKindTest {

    @Test
    public void values() throws Exception {
        SnsKind[] actual = SnsKind.values();
        System.out.println("actual:" + actual);
    }

    @Test
    public void valueOf() throws Exception {
        SnsKind actual = SnsKind.valueOf("TWITTER");
        System.out.println("actual:" + actual);
    }
}