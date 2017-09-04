package org.venuspj.todox.core.model.story;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.todox.core.model.actor.ActorId;
import org.venuspj.todox.core.model.feature.Feature;
import org.venuspj.todox.core.model.project.Project;
import org.venuspj.todox.core.model.sprint.Sprint;
import org.venuspj.todox.core.model.story.configuration.StoryConfiguration;
import org.venuspj.todox.core.model.story.estimaton.StoryPoint;
import org.venuspj.todox.core.model.story.kanoModel.KanoModel;
import org.venuspj.todox.core.model.task.TaskIds;

/**
 * 利用者が目的の為に何かをするという形式
 */
public class Story extends AbstractEntity<Story> {
    private ActorId actorId;
    private StoryDescription storyDescription = StoryDescription.empty();
    private StoryConfiguration storyConfiguration = new StoryConfiguration();
    private StoryPoint storyPoint;
    private KanoModel kanoModel;
    private Project project;
    private Feature feature;
    private Sprint sprint;
    private TaskIds taskIds;

    public Story(EntityIdentifier<Story> anIdentifier, ActorId anActorId, StoryPoint aStoryPoint, KanoModel aKanoModel, Project aProject, Feature aFeature, Sprint aSprint, TaskIds aTaskIds) {
        super(anIdentifier);
        actorId = anActorId;
        storyPoint = aStoryPoint;
        kanoModel = aKanoModel;
        project = aProject;
        feature = aFeature;
        sprint = aSprint;
        taskIds = aTaskIds;

    }

    @Override
    public String toString() {
        return string()
                .add("actorId", actorId)
                .add("storyDescription", storyDescription)
                .add("storyConfiguration", storyConfiguration)
                .add("storyPoint", storyPoint)
                .add("kanoModel", kanoModel)
                .add("project", project)
                .add("storyPoint", storyPoint)
                .add("feature", feature)
                .add("sprint", sprint)
                .add("taskIds", taskIds)
                .omitNullValues()
                .toString();
    }
}
