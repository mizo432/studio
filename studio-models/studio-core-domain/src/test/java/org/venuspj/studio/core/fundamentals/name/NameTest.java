package org.venuspj.studio.core.fundamentals.name;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;


/**
 * Created by mizoguchi on 2017/04/20.
 */
public class NameTest {
    @Test
    public void defaultName() throws Exception {
        Name target = Name.defaultName();
        assertThat(target).isNotNull();
        assertThat(target.asText()).isNull();
    }

}