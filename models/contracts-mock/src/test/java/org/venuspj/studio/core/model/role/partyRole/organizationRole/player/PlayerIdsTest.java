package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.junit.Test;
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/model/player/PlayerIdsTest.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.collect.Lists2;
=======
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/model/role/partyRole/organizationRole/player/PlayerIdsTest.java

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
    public void testToString1() throws Exception {
        PlayerIds target = new PlayerIds();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PlayerIds target = PlayerIdsMock.createDummy(PlayerIdsMock.PlayerIdsType.ONE_DEEJEY);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}