package org.venuspj.studio.core.usecase.news;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.news.NewsCriteria;

public interface NewsesQueryInputPort extends Request {
    NewsCriteria getNewsCriteria();

}
