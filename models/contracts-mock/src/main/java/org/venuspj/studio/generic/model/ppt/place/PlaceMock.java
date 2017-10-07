package org.venuspj.studio.generic.model.ppt.place;

public class PlaceMock {
    public static Place createDummy(PlaceType aPlaceType) {
        return aPlaceType.getPlace();
    }

    public enum PlaceType {
        EMPTY {
            @Override
            public Place getPlace() {
                return PlaceImpl.emptyPlace();
            }
        };

        public abstract Place getPlace();
    }
}
