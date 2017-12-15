package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PartyPlaceThingIdentifierTest {
    @Test
    public void equals1() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);

        // then
        assertThat(target.equals(target)).isTrue();
    }

    @Test
    public void equals2() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);

        // then
        assertThat(target.equals(null)).isFalse();
    }

    @Test
    public void equals3() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);
        PartyPlaceThingIdentifier other = new PartyPlaceThingIdentifier<>(2);

        // then
        assertThat(target.equals(other)).isFalse();
    }

    @Test
    public void hashCode1() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);

        assertThat(target.hashCode()).isEqualTo(732099778);

    }

    @Test
    public void hashCode2() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>();

        assertThat(target.hashCode()).isEqualTo(732099777);
    }

    @Test
    public void sameValueAs1() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);

        // then
        assertThat(target.sameValueAs(target)).isTrue();
    }

    @Test
    public void sameValueAs2() throws Exception {
        PartyPlaceThingIdentifier target = new PartyPlaceThingIdentifier<>(1);

        // then
        assertThat(target.sameValueAs(null)).isFalse();
    }

}