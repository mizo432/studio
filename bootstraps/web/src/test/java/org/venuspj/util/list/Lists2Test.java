package org.venuspj.util.list;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.*;

/**
 * Created by mizoguchi on 2017/07/10.
 */
public class Lists2Test {
    @Test
    public void newArrayList1() throws Exception {
        List<Integer> actual = Lists2.newArrayList();
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