package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PlayerIdsTest {

    @Test
    public void empty() throws Exception {
        PlayerIds target =
                PlayerIds.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }


    @Test
    public void toString1() throws Exception {
        PlayerIds target = new PlayerIds();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void toString2() throws Exception {
        PlayerIds target = PlayerIdsMock.createDummy(PlayerIdsMock.PlayerIdsType.ONE_DEEJEY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}