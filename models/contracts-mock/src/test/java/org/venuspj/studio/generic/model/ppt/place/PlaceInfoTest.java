package org.venuspj.studio.generic.model.ppt.place;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PlaceInfoTest {
    @Test
    public void empty() throws Exception {
        PlaceInformation target = PlaceInformation.empty();
        System.out.println(target);
    }

    @Test
    public void constructor() throws Exception {
        PlaceInformation target = PlaceInfoMock.createDummy(PlaceInfoMock.PlaceInfoType.VENUE1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

}
