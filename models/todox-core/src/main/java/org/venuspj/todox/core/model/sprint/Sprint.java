package org.venuspj.todox.core.model.sprint;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.todox.core.funcmentals.nameObject.NameObject;
import org.venuspj.todox.core.model.project.Project;
import org.venuspj.todox.core.model.release.Release;
import org.venuspj.todox.core.model.story.StoryIds;
import org.venuspj.todox.core.model.task.TaskIds;

public class Sprint extends AbstractEntity<Sprint> {
    NameObject nameObject;
    SprintStatus sprintStatus;
    TaskIds urgentTaskIds = TaskIds.empry();
    TaskIds recurrentTaskIds = TaskIds.empry();
    StoryIds storyIds;
    Release release;
    Project project;

    public Sprint(EntityIdentifier<Sprint> aSprintId, TaskIds anUrgentTasks, TaskIds aRecurrentTasks, SprintStatus aSprintStatus, Release aRelease, Project aProject) {
        super(aSprintId);
        sprintStatus = aSprintStatus;
        urgentTaskIds = anUrgentTasks;
        recurrentTaskIds = aRecurrentTasks;
        release = aRelease;
        project = aProject;
    }

    @Override
    public String toString() {
        return string()
                .add("nameObject", nameObject)
                .add("sprintStatus", sprintStatus)
                .add("urgentTaskIds", urgentTaskIds)
                .add("recurrentTaskIds", recurrentTaskIds)
                .add("storyIds", storyIds)
                .add("release", release)
                .add("project", project)
                .omitNullValues()
                .toString();
    }
}
