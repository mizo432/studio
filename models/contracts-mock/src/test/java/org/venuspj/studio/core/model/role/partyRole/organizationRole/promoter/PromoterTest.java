package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.junit.Test;
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/model/promoter/PromoterTest.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;
=======
import org.venuspj.util.dateProvider.StaticDateProvider;
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/model/role/partyRole/organizationRole/promoter/PromoterTest.java

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class PromoterTest {

    @Test
    public void testToString1() throws Exception {
        Promoter target = new Promoter();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
<<<<<<< HEAD:models/core/src/test/java/org/venuspj/studio/core/model/promoter/PromoterTest.java
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Promoter target = createDummy();
=======
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Promoter target = PromoterMock.createDummy(PromoterMock.PromoterType.DEFAULT);
>>>>>>> origin/LHS-68:models/contracts-mock/src/test/java/org/venuspj/studio/core/model/role/partyRole/organizationRole/promoter/PromoterTest.java
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }
}
