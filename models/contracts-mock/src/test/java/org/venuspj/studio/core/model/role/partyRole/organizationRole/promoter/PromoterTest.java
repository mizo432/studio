package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.junit.Test;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

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
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Promoter target = PromoterMock.createDummy(PromoterMock.PromoterType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }
}
