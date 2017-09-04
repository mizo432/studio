package org.venuspj.todox.core.model.story;

import org.venuspj.studio.generic.fundamentals.description.Description;

public enum StoryType {
    DRAFT("検討中"),
    DEFINED("検討完了"),
    ESTIMATED("見積完了"),
    PLANNED("スプリント決定"),
    IMPLEMENTED("実装済"),
    VERIFIED("確認済み"),
    ACCEPTED("受入済み");

    private final Description description;

    StoryType(String aDescription) {
        description = new Description(aDescription);
    }
}
