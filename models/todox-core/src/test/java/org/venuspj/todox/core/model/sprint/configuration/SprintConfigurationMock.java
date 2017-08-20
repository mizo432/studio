package org.venuspj.todox.core.model.sprint.configuration;

import java.time.LocalDate;

public class SprintConfigurationMock {
    public static SprintConfiguration createMock(SprintConfigurationType mockType) {
        return new SprintConfiguration(new DefaultSprintDays(0), new FirstSprintStartDate(LocalDate.now()), AutoCreateTaskOnEmptyStoryWhenSprintIsActivated.AUTO_CREATE);
    }

    public enum SprintConfigurationType {
        DEFAULT

    }
}