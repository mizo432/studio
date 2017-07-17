package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class StudioCodeTest {


    @Test
    public void testToString1() {
        StudioCode target = new StudioCode();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);

    }

    @Test
    public void testToString2() {
        StudioCode target = StudioCodeMock.createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);

    }

    @Test
    public void equals1() {
        StudioCode target = new StudioCode();
        assertThat(target.equals(new StudioCode())).isTrue();

    }

    @Test
    public void equals2() {
        StudioCode target = StudioCodeMock.createDummy();
        assertThat(target.equals(new StudioCode())).isFalse();

    }

    @Test
    public void hashCode1() {
        StudioCode target = new StudioCode();
        assertThat(target.hashCode()).isEqualTo(-1926346837);

    }

    @Test
    public void hashCode2() {
        StudioCode target = StudioCodeMock.createDummy();
        assertThat(target.hashCode()).isEqualTo(-1926271486);

    }
}
