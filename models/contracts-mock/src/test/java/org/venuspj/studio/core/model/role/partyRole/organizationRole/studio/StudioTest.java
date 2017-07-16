package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.junit.Test;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class StudioTest {

    @Test
    public void equalsTest() {
        Studio target = new Studio();
        assertThat(target.equals(new Studio())).isTrue();

    }

    @Test
    public void hashCodeTest() {
        Studio target = new Studio();
        assertThat(target.hashCode()).isEqualTo(-1926346837);

    }

    @Test
    public void testToString1() {
        Studio target = new Studio();
        assertThat(target)
                .isNotNull();

        System.out.println("target:" + target);

    }

    @Test
    public void testToString2() {
        Studio target = StudioMock.createDummy();
        assertThat(target)
                .isNotNull();

        System.out.println("target:" + target);

    }

    @Test
    public void getIdentifier1() {
        Studio target = StudioMock.createDummy();
        EntityIdentifier<Studio> actual = target.identifier();
        assertThat(actual)
                .isNotNull();

        System.out.println("actual:" + actual);

    }
}
