package org.venuspj.studio.adapter.presenters.studio;

import org.springframework.ui.Model;
import org.venuspj.studio.adapter.presenters.SpringView;

public class StudioView implements SpringView<StudioViewModel> {
    @Override
    public String getTemplatePath() {
        return "";
    }

    @Override
    public SpringView<StudioViewModel> bind(Model model) {
        return null;
    }

    @Override
    public StudioView setViewModel(StudioViewModel viewModel) {
        return null;
    }
}
