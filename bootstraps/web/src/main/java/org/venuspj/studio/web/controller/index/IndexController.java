package org.venuspj.studio.web.controller.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.venuspj.studio.adapter.presenters.index.IndexPagePresenter;
import org.venuspj.studio.core.usecase.event.events.FetchEventsUseCase;
import org.venuspj.studio.core.usecase.product.products.FetchProductsUseCase;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsUseCase;
import org.venuspj.studio.web.controller.index.requests.IndexRequest;

@RequestMapping("/")
public class IndexController {

    private FetchTopicsUseCase fetchTopicsUseCase;
    private FetchEventsUseCase fetchEventsUseCase;
    private FetchProductsUseCase fetchProductsUseCase;

    @Autowired
    IndexController(FetchTopicsUseCase aFetchTopicsUseCase,
                    FetchEventsUseCase aFetchEventsUseCase,
                    FetchProductsUseCase aFetchProductsUseCase) {
        fetchTopicsUseCase = aFetchTopicsUseCase;
        fetchEventsUseCase = aFetchEventsUseCase;
        fetchProductsUseCase = aFetchProductsUseCase;

    }

    public String get(Model model) {
        IndexPagePresenter indexPagePresenter = new IndexPagePresenter();
        IndexRequest indexRequest = new IndexRequest();

        fetchTopicsUseCase.execute(indexRequest, indexPagePresenter);
        fetchEventsUseCase.execute(indexRequest, indexPagePresenter);
        fetchProductsUseCase.execute(indexRequest, indexPagePresenter);

        return indexPagePresenter
                .createView()
                .bind(model)
                .getTemplatePath();

    }

}
