package org.venuspj.studio.usecase.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.news.News;
import org.venuspj.studio.core.model.news.NewsRepository;
import org.venuspj.studio.core.usecase.news.FetchNewsRequest;
import org.venuspj.studio.core.usecase.news.FetchNewsResponse;
import org.venuspj.studio.core.usecase.news.FetchNewsUseCase;

@Service
public class FetchNews implements FetchNewsUseCase {
    NewsRepository newsRepository;

    @Autowired
    FetchNews(NewsRepository aNewsRepository) {
        newsRepository = aNewsRepository;
    }

    @Override
    public void execute(FetchNewsRequest request, FetchNewsResponse response) {
        News news = newsRepository.resolve(request.getNewsIdentifier());
        response.setNews(news);

    }
}
