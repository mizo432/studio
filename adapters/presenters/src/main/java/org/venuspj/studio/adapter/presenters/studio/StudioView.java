package org.venuspj.studio.adapter.presenters.studio;

import org.springframework.ui.Model;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

public class StudioView implements SpringView<StudioViewModel> {
    private final Studio studio;

    public StudioView(Studio aStudio) {
        studio = aStudio;
    }

    @Override
    public String getTemplatePath() {
        return "/studio";
    }

    @Override
    public SpringView<StudioViewModel> bind(Model model) {
        model.addAttribute("studio", studio);
        return this;
    }

    @Override
    public StudioView setViewModel(StudioViewModel viewModel) {
        return null;
    }
}
