package org.venuspj.studio.adapter.datasource.core.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventMock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventDatasourceTest {

    @Transactional
    @Test
    public void インスタンスの存在確認() throws Exception {
//        assertThat(eventDatasource)
//                .isNotNull();
    }

    @Transactional
    //@Test(expected = DataIntegrityViolationException.class)
    @Test
    public void store1() throws Exception {
        Event event = EventMock.createDummy(EventMock.EventType.NOT_INSERTED_EVENT);
        System.out.println(event);
//        eventDatasource.store(event);

    }

}
