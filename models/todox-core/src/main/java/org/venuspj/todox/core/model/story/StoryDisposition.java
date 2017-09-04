package org.venuspj.todox.core.model.story;

import org.venuspj.studio.generic.fundamentals.description.Description;

public enum StoryDisposition {
    PLANNED("計画時ストーリー"),
    CARRIED_OVER("繰越ストーリー"),
    DISCOVERED("計画後追加ストリー");

    private final Description description;

    StoryDisposition(String aDescription) {
        description = new Description(aDescription);
    }
}
