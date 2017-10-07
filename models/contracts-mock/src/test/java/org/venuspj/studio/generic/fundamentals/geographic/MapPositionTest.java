package org.venuspj.studio.generic.fundamentals.geographic;

import org.junit.Test;

public class MapPositionTest {
    @Test
    public void empty() throws Exception {
        MapPosition target = MapPosition.emptyMapPosition();
        System.out.println(target);
    }

    @Test
    public void constractor() throws Exception {
        MapPosition target = MapPositionMock.createDummy(MapPositionMock.MapPositionType.SAKAWAGAWA);
        System.out.println(target);
    }

}
