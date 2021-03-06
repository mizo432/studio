package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class PlayerClassificationTest {


    @Test
    public void isStudioPlayer1() throws Exception {

        boolean actual = PlayerClassification.STUDIO_PLAYER.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isStudioPlayer2() throws Exception {

        boolean actual = PlayerClassification.OUTER_PLAYER.isStudioPlayer();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }

    @Test
    public void values() throws Exception {

        PlayerClassification[] actual = PlayerClassification.values();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void valueOf() throws Exception {
        PlayerClassification actual = PlayerClassification.valueOf(PlayerClassification.STUDIO_PLAYER.name());
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}
