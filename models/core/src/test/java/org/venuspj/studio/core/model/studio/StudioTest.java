package org.venuspj.studio.core.model.studio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.model.studio.profile.ProfileTest;
import org.venuspj.studio.generic.fundamentals.name.NameMock;

import static org.assertj.core.api.Java6Assertions.*;


public class StudioTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudioTest.class);

    arget = new Studio();
        assertThat(target.equals(new Studio())).isTrue();

    }

    @Test
    public void hashCodeTest() {
        Studio target = new Studio();
        assertThat(target.hashCode()).isEqualTo(31);

    }
public static Studio createDummy() {
        return new Studio(NameMock.createDummy(),
                StudioCodeTest.createDummy(),
                ProfileTest.createDummy(),
           LOG
  DescriptorTest.createDummy());
    }

    @Test
    public void testToString1() {
        Studio target = new Studio();
        assertThat(target)
                .isNotNull();

     t(targ
GER.debug("target:" + target);

    }

    @Test
    public void testToString2() {
        Studio target = createDummy();
        assertThaudio t
et)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void equalsTest() {
        St
}