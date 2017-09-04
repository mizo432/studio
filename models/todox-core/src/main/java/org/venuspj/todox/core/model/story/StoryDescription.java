package org.venuspj.todox.core.model.story;

import org.venuspj.todox.core.funcmentals.nameObject.NameObject;

import static org.venuspj.util.objects2.Objects2.*;

public class StoryDescription {

    NameObject nameObject;

    public StoryDescription(NameObject aNameObject) {
        nameObject = aNameObject;
    }

    public static StoryDescription empty() {
        return new StoryDescription(NameObject.defaultNameObject());

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(nameObject)
                .omitNullValues()
                .toString();
    }
}
