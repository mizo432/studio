package org.venuspj.studio.generic.fundamentals.geographic;

public class MapPositionMock {
    public static MapPosition createDummy(MapPositionType aMapPositionType) {
        return aMapPositionType.getMapPosition();
    }

    public enum MapPositionType {
        EMPTY {
            @Override
            public MapPosition getMapPosition() {
                return MapPosition.emptyMapPosition();
            }
        }, SAKAWAGAWA {
            @Override
            public MapPosition getMapPosition() {
                return new MapPosition(
                        LatitudeMock.createDummy(LatitudeMock.LatitudeType.SAKAWAGAWA),
                        LongitudeMock.createDummy(LongitudeMock.LongitudeType.SAKAWAGAWA));
            }
        };

        public abstract MapPosition getMapPosition();
    }
}
