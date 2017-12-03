package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

/**
 */
public class StudioMock {

    public static Studio createDummy(StudioMockType aMockType) {
        return aMockType.create();
    }

    private enum StudioMockType {
        EMPTY {
            @Override
            public Studio create() {
                return null;
            }
        };

        public abstract Studio create();

    }
}
