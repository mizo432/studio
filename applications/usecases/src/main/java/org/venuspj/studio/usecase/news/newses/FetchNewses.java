package org.venuspj.studio.usecase.news.newses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.news.NewsRepository;
import org.venuspj.studio.core.model.news.Newses;
import org.venuspj.studio.core.usecase.news.newses.FetchNewsesRequest;
import org.venuspj.studio.core.usecase.news.newses.FetchNewsesResponse;
import org.venuspj.studio.core.usecase.news.newses.FetchNewsesUseCase;

@Service
public class FetchNewses implements FetchNewsesUseCase {
    NewsRepository newsRepository;

    @Autowired
    FetchNewses(NewsRepository aNewsRepository) {
        newsRepository = aNewsRepository;
    }

    @Override
    public void execute(FetchNewsesRequest request, FetchNewsesResponse response) {
        Newses newses = newsRepository.resolveEntities(request.getNewsCriteria());
        response.setNewses(newses);

    }
}
