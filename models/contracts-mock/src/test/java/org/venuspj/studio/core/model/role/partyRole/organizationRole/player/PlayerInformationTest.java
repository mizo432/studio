package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PlayerInformationTest {
    @Test
    public void name() {
        PlayerInformation target = PlayerInformationMock.createDummy(PlayerInformationMock.PlayerInformationMockType.DEEJEY1);
        System.out.println("target:" + toStringHelper(target).defaultConfig().toString());
    }
}
