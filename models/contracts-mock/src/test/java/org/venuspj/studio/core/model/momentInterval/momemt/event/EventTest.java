package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.junit.Test;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class EventTest {


    @Test
    public void testToString1() throws Exception {
        Event target = new Event();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void testToString2() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void equals1() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        boolean actual = target.equals(null);
        assertThat(actual)
                .isFalse();

    }

    @Test
    public void equals2() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();

    }

    @Test
    public void hashCode1() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        int actual = target.hashCode();
        assertThat(actual)
                .isEqualTo(-1074738143);
    }

    @Test
    public void hashCode2() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        int actual = target.hashCode();
        assertThat(actual)
                .isEqualTo(target.identifier().hashCode());
    }

    @Test
    public void equals3() throws Exception {
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();

    }

    @Test
    public void equals4() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual)
                .isFalse();

    }

}