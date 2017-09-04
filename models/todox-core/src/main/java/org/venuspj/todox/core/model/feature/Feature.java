package org.venuspj.todox.core.model.feature;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.todox.core.funcmentals.nameObject.NameObject;
import org.venuspj.todox.core.model.story.StoryIds;

public class Feature extends AbstractEntity<Feature> {
    NameObject nameObject;
    StoryIds storyIds;

    public Feature(EntityIdentifier<Feature> anIdentifier, NameObject aNameObject, StoryIds anyStoryIds) {
        super(anIdentifier);
        nameObject = aNameObject;
        storyIds = anyStoryIds;
    }

    @Override
    public String toString() {
        return string()
                .add("nameObject", nameObject)
                .add("storyIds", storyIds)
                .omitNullValues()
                .toString();
    }
}
