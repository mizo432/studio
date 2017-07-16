package org.venuspj.studio.adapter.datasource.studio;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudioDatasourceTest {
    @Autowired
    StudioRepository studioRepository;

    @Test
    @Ignore
    public void constructor() {
        assertThat(studioRepository)
                .isNotNull();
    }
}
