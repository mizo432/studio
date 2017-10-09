package org.venuspj.studio.adapter.datasource.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventMock;

import javax.transaction.Transactional;

import static org.assertj.core.api.Java6Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventDatasourceTest {

    @Autowired
    EventDatasource eventDatasource;

    @Test
    public void インスタンスの存在確認() throws Exception {
        assertThat(eventDatasource)
                .isNotNull();
    }

    @Transactional
    @Test
    public void store1() throws Exception {
        Event event = EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);

        eventDatasource.store(event);

        Event actual = eventDatasource.resolve(event.identifier());
        assertThat(actual)
                .isNotNull();
        System.out.println(actual);
        assertThat(actual.identifier())
                .isNotNull()
                .isEqualTo(event.identifier());
    }

}
