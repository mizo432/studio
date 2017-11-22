package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.usecase.studio.FetchStudioResponse;

public class StudioPresenter implements Presenter<StudioView>, FetchStudioResponse {

    private Studio studio;

    @Override
    public StudioView createView() {
        //return new StudioView(studio.getStudioInfo().getStudioCode().asText());
        return null;
    }

    @Override
    public void setStudio(Studio aStudio) {
        studio = aStudio;
    }
}
