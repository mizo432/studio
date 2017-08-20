package org.venuspj.todox.core.model.project.configuration;

import org.venuspj.todox.core.model.sprint.configuration.SprintConfiguration;
import org.venuspj.todox.core.model.story.configuration.StoryConfiguration;
import org.venuspj.todox.core.model.task.configuration.TaskConfiguration;
import org.venuspj.todox.core.model.team.configuration.TeamConfiguration;
import org.venuspj.util.objects2.Objects2;

public class ChildConfigurations {
    SprintConfiguration sprintConfiguration;
    StoryConfiguration storyConfiguration;
    TaskConfiguration taskConfiguration;
    TeamConfiguration teamConfiguration;

    public ChildConfigurations(SprintConfiguration aSprintConfiguration,
                               StoryConfiguration aStoryConfiguration,
                               TaskConfiguration aTaskConfiguration,
                               TeamConfiguration aTeamConfiguration) {
        sprintConfiguration = aSprintConfiguration;
        storyConfiguration = aStoryConfiguration;
        taskConfiguration = aTaskConfiguration;
        teamConfiguration = aTeamConfiguration;

    }


    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("sprintConfiguration", sprintConfiguration)
                .add("storyConfiguration", storyConfiguration)
                .add("taskConfiguration", taskConfiguration)
                .add("teamConfiguration", teamConfiguration)
                .omitNullValues()
                .toString();
    }

}
