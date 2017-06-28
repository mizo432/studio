package org.venuspj.studio.core.model.promoter;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PromoterIdTest {
    public static PromoterId createDummy() {
        return new PromoterId(1);
    }

    @Test
    public void toString01() throws Exception {
        PromoterId target = new PromoterId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void toString02() throws Exception {
        PromoterId target = createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void isPresent() throws Exception {
        PromoterId target = new PromoterId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void defaultEventId() throws Exception {
        PromoterId target = PromoterId.defaultEventId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);

    }
}
