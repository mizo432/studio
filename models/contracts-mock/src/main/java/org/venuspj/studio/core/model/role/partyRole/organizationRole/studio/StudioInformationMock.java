package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.ProfileMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.topic.Topics;

public class StudioInformationMock {
    public static StudioInformation createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        EMPTY {
            @Override
            public StudioInformation create() {
                return StudioInformation.empty();
            }
        },
        LHS {
            @Override
            public StudioInformation create() {
                return new StudioInformation(
                        ProfileMock.createDummy(ProfileMock.MockType.LHS),
                        new StudioCode("studio"), Topics.empty());
            }
        };

        public abstract StudioInformation create();
    }
}
