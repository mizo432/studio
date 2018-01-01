package org.venuspj.studio.adapter.presenters.studio;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.studio.StudioViewModel;

public class StudioPage implements SpringView<StudioViewModel> {

    private static final String STUDIO_PAGE_TEMPLATE = "/studio";

    private StudioViewModel studioViewModel;

    public StudioPage() {
    }

    @Override
    public String getTemplatePath() {
        return STUDIO_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<StudioViewModel> bind(Model model) {
        model.addAttribute("studio", studioViewModel);
        return this;
    }


    @Override
    public View<StudioViewModel> setViewModel(StudioViewModel aViewModel) {
        studioViewModel = aViewModel;
        return this;
    }
}
