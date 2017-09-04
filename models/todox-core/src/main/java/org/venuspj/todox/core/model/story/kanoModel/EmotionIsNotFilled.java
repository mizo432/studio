package org.venuspj.todox.core.model.story.kanoModel;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

public enum EmotionIsNotFilled {
    satisfaction(new Name("満足"), new Description("素晴らしい")),
    like(new Name("好感"), new Description("嬉しい")),
    neutral(new Name("中立"), new Description("特になんとも思わない/気にならない")),
    dislike(new Name("不快"), new Description("我慢できる")),
    dissatisfied(new Name("不満"), new Description("それは困る、我慢できない"));

    private final Name name;
    private final Description description;

    EmotionIsNotFilled(Name aName, Description aDescription) {
        name = aName;
        description = aDescription;
    }
}
