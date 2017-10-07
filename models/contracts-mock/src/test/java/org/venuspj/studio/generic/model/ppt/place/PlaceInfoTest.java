package org.venuspj.studio.generic.model.ppt.place;

import org.junit.Test;

public class PlaceInfoTest {
    @Test
    public void empty() throws Exception {
        PlaceInfo target = PlaceInfo.emptyPlaceInfo();
        System.out.println(target);
    }

    @Test
    public void constructor() throws Exception {
        PlaceInfo target = PlaceInfoMock.createDummy(PlaceInfoMock.PlaceInfoType.VENUE1);
        System.out.println(target);
    }

}
