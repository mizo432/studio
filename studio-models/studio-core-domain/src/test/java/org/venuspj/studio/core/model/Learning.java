package org.venuspj.studio.core.model;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Learning {


    @Test
    public void test01(){
        LocalDate ld = LocalDate.of(2017,1,8);
        int a = ld.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
        System.out.println(a);
    }
}
