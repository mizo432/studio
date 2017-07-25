package org.venuspj.studio.core.fundamentals.contact;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class ContactsTest {

    @Test
    public void testToString1() throws Exception {
        Contacts target = new Contacts();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Contacts target = ContactsMock.createDummy(ContactsMock.ContactsType.EMPTY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString3() throws Exception {
        Contacts target = ContactsMock.createDummy(ContactsMock.ContactsType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}