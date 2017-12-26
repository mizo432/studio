package org.venuspj.studio.core.usecase.news;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.news.NewsIdentifier;

public interface FetchNewsRequest extends Request {
    NewsIdentifier getNewsIdentifier();
}
