package org.venuspj.studio.generic.model.ppt.party.parson;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PersonIdTest {
    @Test
    public void newId() throws Exception {
        PersonId target = PersonId.newPersonId();
        String actual = target.toString();
        System.out.println(actual);
    }

    @Test
    public void empty() throws Exception {
        PersonId target = PersonId.emptyPersonId();
        System.out.println(target);
    }

    @Test
    public void toString1() throws Exception {
        PersonId target = PersonId.emptyPersonId();
        String actual = target.toString();
        System.out.println(actual);

    }

    @Test
    public void toString2() throws Exception {
        PersonId target = PersonId.newPersonId();
        String actual = target.toString();
        System.out.println(actual);

    }

    @Test
    public void isPresent1() throws Exception {
        PersonId target = PersonId.emptyPersonId();
        boolean actual = target.isPresent();
        assertThat(actual).isFalse();

    }

    @Test
    public void isPresent2() throws Exception {
        PersonId target = PersonId.newPersonId();
        boolean actual = target.isPresent();
        assertThat(actual).isTrue();

    }

}