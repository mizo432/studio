package org.venuspj.studio.core.model.role.thingRole.product;

import org.junit.Test;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.momentInterval.momemt.event.DescriptorMock;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.fundamentals.name.NameMock;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ProductIdTest {

    @Test
    public void testToString1() throws Exception {
        ProductId target = new ProductId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        ProductId productId = ProductIdMock.createDummy(ProductIdMock.ProductIdType.DEFAULT);
        Name name = NameMock.createDummy(NameMock.NameType.ALUBUM_NAME1);
        Descriptor descriptor = DescriptorMock.createDummy(DescriptorMock.DescriptorType.ALBUM1);
        Product target = new Product(productId, descriptor);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}