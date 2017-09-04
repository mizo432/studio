package org.venuspj.todox.core.model.task;

import org.venuspj.studio.generic.fundamentals.description.Description;

public enum TaskDisposition {
    PLANNED("計画時タスク"),
    CARRIED_OVER("繰越タスク"),
    DISCOVERED("計画後追加タスク");

    private final Description description;

    TaskDisposition(String aDescription) {
        description = new Description(aDescription);
    }
}
