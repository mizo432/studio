package org.venuspj.studio.core.usecase.news.newses;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.news.NewsCriteria;

public interface FetchNewsesRequest extends Request {
    NewsCriteria getNewsCriteria();

}
