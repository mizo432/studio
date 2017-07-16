package org.venuspj.studio.core.model.role.thingRole.product;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ProductTest {

    @Test
    public void testToString1() throws Exception {
        Product target = new Product();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Product target = ProductMock.createDummy(ProductMock.ProductType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}