package org.venuspj.studio.core.model.topic;

import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.core.model.topic.topics.Topics;

public interface TopicRepository extends CrudRepository<Topic> {
    Topics resolveEntities(TopicCriteria aCriteria);

}
