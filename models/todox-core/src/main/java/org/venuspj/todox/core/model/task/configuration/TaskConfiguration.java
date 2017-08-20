package org.venuspj.todox.core.model.task.configuration;

import org.venuspj.util.objects2.Objects2;

public class TaskConfiguration {
    DisplayRecurrentTasks displayRecurrentTasks;
    DisplayUrgentTasks displayUrgentTasks;
    AutoAssignTeamMemberOnStartTask autoAssignTeamMemberOnStartTask;
    AutoSetStoryAsDoneWhenAllTasksAreDone autoSetStoryAsDoneWhenAllTasksAreDone;

    public TaskConfiguration(DisplayRecurrentTasks aDisplayRecurrentTasks, DisplayUrgentTasks aDisplayUrgentTasks,
                             AutoAssignTeamMemberOnStartTask anAutoAssignTeamMemberOnStartTask,
                             AutoSetStoryAsDoneWhenAllTasksAreDone anAutoSetStoryAsDoneWhenAllTasksAreDone) {
        displayRecurrentTasks = aDisplayRecurrentTasks;
        displayUrgentTasks = aDisplayUrgentTasks;
        autoAssignTeamMemberOnStartTask = anAutoAssignTeamMemberOnStartTask;
        autoSetStoryAsDoneWhenAllTasksAreDone = anAutoSetStoryAsDoneWhenAllTasksAreDone;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("displayRecurrentTasks", displayRecurrentTasks)
                .add("displayUrgentTasks", displayUrgentTasks)
                .add("autoAssignTeamMemberOnStartTask", autoAssignTeamMemberOnStartTask)
                .add("autoSetStoryAsDoneWhenAllTasksAreDone", autoSetStoryAsDoneWhenAllTasksAreDone)
                .omitNullValues()
                .toString();
    }
}
