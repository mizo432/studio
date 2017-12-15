package org.venuspj.studio.core.fundamentals.descriptor;

import org.junit.Test;

public class DescriptorTest {

    @Test
    public void testToString01() {
        Descriptor target = new Descriptor();
        System.out.append("target:" + target);
    }

    @Test
    public void testToString02() {
        Descriptor target = DescriptorMock.createDummy(DescriptorMock.DescriptorType.DEFAULT);
        System.out.append("target:" + target);
    }


}
