package org.venuspj.studio.core.usecase.news.newses;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.news.Newses;

public interface FetchNewsesResponse extends Response {

    void setNewses(Newses newses);

}
