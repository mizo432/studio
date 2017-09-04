package org.venuspj.todox.core.model.task;

import org.venuspj.studio.generic.fundamentals.description.Description;

public enum TaskStatus {
    NON_STARTED("N", "未着手"),
    STARTED("S", "着手中"),
    COMPLETED("C", "完了"),
    DELETED("D", "不要作業");

    private final String code;
    private final Description description;

    TaskStatus(String aCode, String aDescription) {
        code = aCode;
        description = new Description(aDescription);
    }
}
