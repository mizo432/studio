package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PlayerIdTest {


    @Test
    public void defaultId() throws Exception {
        PlayerId target = PlayerId.defaultId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString1() throws Exception {
        PlayerId target = new PlayerId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PlayerId target = PlayerIdMock.createDummy(PlayerIdMock.PlayerIdType.DEEJEY1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }
}
