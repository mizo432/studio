package org.venuspj.studio.usecase.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.news.NewsRepository;
import org.venuspj.studio.core.model.news.Newses;
import org.venuspj.studio.core.usecase.news.NewsesQueryInputPort;
import org.venuspj.studio.core.usecase.news.NewsesQueryOutputPort;
import org.venuspj.studio.core.usecase.news.NewsesQueryUseCase;

@Service
public class NewsesQuery implements NewsesQueryUseCase {
    NewsRepository newsRepository;

    @Autowired
    NewsesQuery(NewsRepository aNewsRepository) {
        newsRepository = aNewsRepository;
    }

    @Override
    public void execute(NewsesQueryInputPort request, NewsesQueryOutputPort response) {
        Newses newses = newsRepository.resolveEntities(request.getNewsCriteria());
        response.setNewses(newses);

    }
}
