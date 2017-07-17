package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class PromotersTest {

    @Test
    public void testToString1() {
        Promoters target = new Promoters();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();

        System.out.println("actual:" + actual);

    }

    @Test
    public void testToString2() throws Exception {
        Promoters target = PromotersMock.createDummy(PromotersMock.PromotersType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void empty() throws Exception {
        Promoters target =
                Promoters.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}
