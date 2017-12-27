package org.venuspj.studio.core.model.role.thingRole.product;

import org.junit.Test;
import org.venuspj.studio.core.model.role.thingRole.ProductMock;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class ProductTest {

    @Test
    public void toString1() throws Exception {
        Product target = Product.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void toString2() throws Exception {
        Product target = ProductMock.createDummy(ProductMock.MockType.PRODUCT1);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}