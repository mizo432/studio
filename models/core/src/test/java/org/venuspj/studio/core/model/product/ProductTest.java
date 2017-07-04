package org.venuspj.studio.core.model.product;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.studio.StudioCode;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class ProductTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductTest.class);

    @Test
    public void testToString1() throws Exception {
        Product target = new Product();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StudioCode studioCode = new StudioCode("LHS");
        Integer value = 10;
        ProductId productId = new ProductId(studioCode, value);
        Name name = new Name("ALBUM_NAME");

        Description description = new Description("description");
        Descriptor descriptor = new Descriptor(name, description);
        Product target = new Product(productId, descriptor);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}