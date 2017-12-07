package org.venuspj.studio.generic.fundamentals.quantity;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class QuantityTest {
    @Test
    public void toString01() throws Exception {
        Quantity target = new Quantity();
        System.out.println("actual:" + toStringHelper(target).defaultConfig().toString());
    }
    

}