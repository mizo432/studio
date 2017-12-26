package org.venuspj.studio.core.usecase.news;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.news.News;

public interface FetchNewsResponse extends Response {
    void setNews(News news);

}
