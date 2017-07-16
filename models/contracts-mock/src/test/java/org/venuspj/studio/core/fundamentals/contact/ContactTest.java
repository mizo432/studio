package org.venuspj.studio.core.fundamentals.contact;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ContactTest {

    @Test
    public void testToString1() throws Exception {
        Contact target = new Contact();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Contact target = ContactMock.createDummy(ContactMock.ContactType.EMPTY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}