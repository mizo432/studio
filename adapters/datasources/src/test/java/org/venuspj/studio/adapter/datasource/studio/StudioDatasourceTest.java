package org.venuspj.studio.adapter.datasource.studio;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;

import static org.assertj.core.api.Java6Assertions.*;

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
