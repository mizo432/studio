package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.usecase.studio.FetchStudioResponse;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationInformation;
import org.venuspj.studio.view.studio.StudioPage;
import org.venuspj.studio.view.studio.StudioViewModel;

public class StudioPresenter implements Presenter<StudioPage>, FetchStudioResponse {

    private StudioViewModel studioViewModel;

    @Override
    public StudioPage createView() {
        StudioPage view = new StudioPage();
        view.setViewModel(studioViewModel);
        return view;
    }

    @Override
    public void setStudio(Studio aStudio) {
        studioViewModel = createViewModel(aStudio);
    }

    private StudioViewModel createViewModel(Studio aStudio) {
        OrganizationInformation organizationInformation = aStudio.getOrganization().getOrganizationInformation();
        StudioViewModel result = new StudioViewModel
                .Builder()
                .withStudioName(organizationInformation.getName().asText())
                .withStudioDescription(aStudio.getStudioInformation().getProfile().getDescription().asText())
                .build();
        return result;
    }
}
