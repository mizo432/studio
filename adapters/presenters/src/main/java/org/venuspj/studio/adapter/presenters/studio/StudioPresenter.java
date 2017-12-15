package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.usecase.studio.FetchStudioResponse;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationInformation;

public class StudioPresenter implements Presenter<StudioView>, FetchStudioResponse {

    private StudioViewModel studioViewModel;

    @Override
    public StudioView createView() {
        StudioView view = new StudioView();
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
