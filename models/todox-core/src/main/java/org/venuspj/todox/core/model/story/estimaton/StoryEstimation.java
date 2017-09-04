package org.venuspj.todox.core.model.story.estimaton;

import static org.venuspj.util.objects2.Objects2.*;

public class StoryEstimation {
    private final StoryPoint storyPoint;

    public StoryEstimation(StoryPoint aStoryPoint) {
        storyPoint = aStoryPoint;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(storyPoint)
                .toString();
    }
}
