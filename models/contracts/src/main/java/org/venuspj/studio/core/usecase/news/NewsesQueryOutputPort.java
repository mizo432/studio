package org.venuspj.studio.core.usecase.news;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.news.Newses;

public interface NewsesQueryOutputPort extends Response {

    void setNewses(Newses newses);

}
