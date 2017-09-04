package org.venuspj.todox.core.model.task;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.todox.core.model.project.Project;
import org.venuspj.todox.core.model.sprint.Sprint;
import org.venuspj.todox.core.model.timeEntry.TimeEntries;

public class Task extends AbstractEntity<Task> {
    private final TaskStatus taskStatus;
    private final TaskDisposition taskDisposition;
    private final TimeEntries timeEntries;
    private final Sprint sprint;
    private final Project project;
    TaskType taskType;

    public Task(EntityIdentifier<Task> anIdentifier, TaskDisposition aTaskDisposition, TaskStatus aTaskStatus, TimeEntries aTimeEntries, Sprint aSprint, Project aProject) {
        super(anIdentifier);
        taskDisposition = aTaskDisposition;
        taskStatus = aTaskStatus;
        timeEntries = aTimeEntries;
        sprint = aSprint;
        project = aProject;
    }

    @Override
    public String toString() {
        return string()
                .add("taskDisposition", taskDisposition)
                .add("taskStatus", taskStatus)
                .add("timeEntries", timeEntries)
                .add("sprint", sprint)
                .add("project", project)
                .omitNullValues()
                .toString();
    }

}
