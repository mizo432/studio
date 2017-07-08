package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PartyPlaceThingIdTest {
    public static PartyPlaceThingId createDummy() {
        return new PartyPlaceThingId("1");
    }

    @Test
    public void toString01() throws Exception {
        PartyPlaceThingId target = new PartyPlaceThingId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void toString02() throws Exception {
        PartyPlaceThingId target = createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void isPresent() throws Exception {
        PartyPlaceThingId target = new PartyPlaceThingId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void newId() throws Exception {
        PartyPlaceThingId target = PartyPlaceThingId.newId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(true);

    }

    @Test
    public void empty() throws Exception {
        PartyPlaceThingId target = PartyPlaceThingId.empty();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);

    }
}
