package org.venuspj.studio.core.model.role.thingRole.product;

import org.junit.Test;
import org.venuspj.studio.core.model.role.thingRole.ProductMock;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ProductTest {

    @Test
    public void toString1() throws Exception {
        Product target = Product.emptyProduct();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void toString2() throws Exception {
        Product target = ProductMock.createDummy(ProductMock.ProductType.PRODUCT1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}