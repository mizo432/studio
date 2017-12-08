package org.venuspj.studio.core.model.news;

import org.venuspj.ddd.model.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News> {
    Newses resolveEntities(NewsCriteria aCriteria);

}
