package org.venuspj.studio.adapter.datasource.event;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Java6Assertions.*;

public class EventDatasourceTest {

    @Autowired
    EventDatasource eventDatasource;

    @Test
    public void インスタンスの存在確認() throws Exception {
        assertThat(eventDatasource)
                .isNotNull();
    }
}