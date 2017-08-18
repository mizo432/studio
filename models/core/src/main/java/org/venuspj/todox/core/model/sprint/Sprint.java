package org.venuspj.todox.core.model.sprint;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.todox.core.model.task.Tasks;

public class Sprint extends AbstractEntity<Sprint> {
    Tasks urgentTasks = Tasks.empry();
    Tasks recurrentTasks = Tasks.empry();
}
