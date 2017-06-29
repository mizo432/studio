package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PersonPlaceThingIdTest {
    public static PersonPlaceThingId createDummy() {
        return new PersonPlaceThingId("1");
    }

    @Test
    public void toString01() throws Exception {
        PersonPlaceThingId target = new PersonPlaceThingId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void toString02() throws Exception {
        PersonPlaceThingId target = createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void isPresent() throws Exception {
        PersonPlaceThingId target = new PersonPlaceThingId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void newId() throws Exception {
        PersonPlaceThingId target = PersonPlaceThingId.newId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(true);

    }

    @Test
    public void empty() throws Exception {
        PersonPlaceThingId target = PersonPlaceThingId.empty();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);

    }
}
