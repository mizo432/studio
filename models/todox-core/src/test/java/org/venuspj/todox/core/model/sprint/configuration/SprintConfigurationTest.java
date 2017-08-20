package org.venuspj.todox.core.model.sprint.configuration;

import org.junit.Test;

import static org.venuspj.todox.core.model.sprint.configuration.SprintConfigurationMock.SprintConfigurationType.*;

public class SprintConfigurationTest {

    @Test
    public void toString1() throws Exception {
        SprintConfiguration target = SprintConfigurationMock.createMock(DEFAULT);
        System.out.println(target);
    }
}