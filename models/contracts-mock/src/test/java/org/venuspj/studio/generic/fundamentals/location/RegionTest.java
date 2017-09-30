package org.venuspj.studio.generic.fundamentals.location;

import org.junit.Test;
import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.code.Code;

import static org.assertj.core.api.Java6Assertions.*;


public class RegionTest {
    @Test
    public void of1() throws Exception {
        Caption label = new Caption("関東");
        Region actual = Region.of(label);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.kantou);

    }

    @Test
    public void of2() throws Exception {
        Caption label = new Caption("関東1");
        Region actual = Region.of(label);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.unknown);

    }

    @Test
    public void findBy1() throws Exception {
        Code code = new Code("rgn01");
        Region actual = Region.findBy(code);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.hokkaido);
    }

    @Test
    public void findBy2() throws Exception {
        Code code = new Code("");
        Region actual = Region.findBy(code);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.unknown);
    }

    @Test
    public void findBy3() throws Exception {
        Code code = new Code("rgn99");
        Region actual = Region.findBy(code);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.kokugai);
    }

    @Test
    public void findBy4() throws Exception {
        Region actual = Region.findBy(null);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Region.unknown);
    }

    @Test
    public void isSameCode1() throws Exception {
        assertThat(Region.kokugai.isSameCode("rgn99"))
                .isTrue();
    }

    @Test
    public void isSameCode2() throws Exception {
        assertThat(Region.kokugai.isSameCode("rgn01"))
                .isFalse();
    }

    @Test
    public void isSameCode3() throws Exception {
        assertThat(Region.kokugai.isSameCode(null))
                .isFalse();
    }
}