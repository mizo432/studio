package org.venuspj.todox.core.model.sprint;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.todox.core.model.task.Tasks;

public class Sprint extends AbstractEntity<Sprint> {
    Tasks urgentTasks = Tasks.empry();
    Tasks recurrentTasks = Tasks.empry();

    Sprint(SprintId aSprintId, Tasks anUrgentTasks, Tasks aRecurrentTasks) {
        super(aSprintId);
        urgentTasks = anUrgentTasks;
        recurrentTasks = aRecurrentTasks;
    }

    @Override
    public String toString() {
        return string()
                .add("urgentTasks", urgentTasks)
                .add("recurrentTasks", recurrentTasks)
                .omitNullValues()
                .toString();
    }
}
