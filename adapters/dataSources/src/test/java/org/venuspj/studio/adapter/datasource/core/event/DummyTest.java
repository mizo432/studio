package org.venuspj.studio.adapter.datasource.core.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyTest {

    @Test
    public void store1() throws Exception {
        System.out.println(LocalDateTime.now());
    }

}
