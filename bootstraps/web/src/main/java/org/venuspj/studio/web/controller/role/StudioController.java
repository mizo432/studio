package org.venuspj.studio.web.controller.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.venuspj.studio.adapter.presenters.studio.StudioPagePresenter;
import org.venuspj.studio.core.usecase.studio.FetchStudioRequest;
import org.venuspj.studio.core.usecase.studio.FetchStudioUseCase;


public class StudioController {

    private final FetchStudioUseCase fetchStudioUseCase;

    @Autowired
    StudioController(FetchStudioUseCase aFetchStudioUseCase) {
        fetchStudioUseCase = aFetchStudioUseCase;
    }


    public String get(Model model,
                      @PathVariable("studioCode") String studioCode) {

        FetchStudioRequest request = new FetchStudioRequest(studioCode);
        StudioPagePresenter response = new StudioPagePresenter();
        fetchStudioUseCase.execute(request, response);

        return response
                .createView()
                .bind(model)
                .getTemplatePath();

    }


}
