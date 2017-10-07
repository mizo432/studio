package org.venuspj.util.list;

import org.junit.Test;
import org.venuspj.util.collect.Lists2;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class Lists2Test {
    @Test
    public void newArrayList1() throws Exception {
        List<Integer> actual = Lists2.newArrayList();
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void newArrayList2() throws Exception {
        Integer integer = Integer.valueOf(10);

        List<Integer> actual = Lists2.newArrayList(integer);
        assertThat(actual)
                .isNotNull();
        assertThat(actual.size())
                .isEqualTo(1);


    }


}