package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;

import java.util.UUID;

import static org.assertj.core.api.Java6Assertions.*;


/**
 */
public class EventIdentifierTest {

    @Test
    public void toString01() throws Exception {
        EventIdentifier target = EventIdentifier.empty();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void toString02() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void isPresent() throws Exception {
        EventIdentifier target = EventIdentifier.empty();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void emptyEventId() throws Exception {
        EventIdentifier target = EventIdentifier.empty();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);

    }

    @Test
    public void equals1() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        boolean actual = target.equals(null);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals2() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals3() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        EventIdentifier other = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals4() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        EventIdentifier other = EventIdMock.createDummy(EventIdMock.EventIDType.EVENT_ON_TOMORROW);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals5() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals6() throws Exception {
        EventIdentifier target = EventIdMock.createDummy(EventIdMock.EventIDType.DEFAULT);
        DefaultEntityIdentifier<Event> other = new DefaultEntityIdentifier<>(Event.class, UUID.randomUUID());
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

}