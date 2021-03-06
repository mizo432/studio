package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;
import org.venuspj.util.collect.Lists2;

import static org.assertj.core.api.Java6Assertions.*;

/**
 * Created by mizoguchi on 2017/06/25.
 */
public class SnsContactsTest {

    public static SnsContacts createDummy() {
        return new SnsContacts(Lists2.newArrayList(SnsContactTest.createDummy()));
    }

    @Test
    public void testToString1() throws Exception {
        SnsContacts target = new SnsContacts();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        SnsContacts target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}