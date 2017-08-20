package org.venuspj.todox.core.model.sprint.configuration;

import org.venuspj.util.objects2.Objects2;

public class SprintConfiguration {

    DefaultSprintDays defaultSprintDays;
    FirstSprintStartDate firstSprintStartDate;
    AutoCreateTaskOnEmptyStoryWhenSprintIsActivated autoCreateTaskOnEmptyStoryWhenSprintIsActivated;

    public SprintConfiguration(DefaultSprintDays aDefaultSprintDays,
                               FirstSprintStartDate aFirstSprintStartDate,
                               AutoCreateTaskOnEmptyStoryWhenSprintIsActivated anAutoCreateTaskOnEmptyStoryWhenSprintIsActivated
    ) {
        defaultSprintDays = aDefaultSprintDays;
        firstSprintStartDate = aFirstSprintStartDate;
        autoCreateTaskOnEmptyStoryWhenSprintIsActivated = anAutoCreateTaskOnEmptyStoryWhenSprintIsActivated;

    }


    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("defaultSprintDays", defaultSprintDays)
                .add("firstSprintStartDate", firstSprintStartDate)
                .add("autoCreateTaskOnEmptyStoryWhenSprintIsActivated", autoCreateTaskOnEmptyStoryWhenSprintIsActivated)
                .omitNullValues()
                .toString();
    }
}
