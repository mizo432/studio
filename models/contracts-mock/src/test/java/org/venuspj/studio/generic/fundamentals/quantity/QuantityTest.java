package org.venuspj.studio.generic.fundamentals.quantity;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class QuantityTest {
    @Test
    public void toString01() throws Exception {
        Quantity target = new Quantity();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Quantity{value=0, unit=Unit{null}}");
    }
    
    @Test
    public void toString02() throws Exception {
        Quantity target = new Quantity(1, new Unit("式"));
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Quantity{value=1, unit=Unit{式}}");
    }

}