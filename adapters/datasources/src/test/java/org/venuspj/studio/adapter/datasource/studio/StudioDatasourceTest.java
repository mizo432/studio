package org.venuspj.studio.adapter.datasource.studio;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.model.studio.StudioRepository;

import static org.assertj.core.api.Java6Assertions.assertThat;

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
