package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.fundamentals.place.Place;
import org.venuspj.studio.core.model.momentInterval.momemt.event.eventOutline.Outline;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerIds;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;

/**
 */
public final class OutlineMock {
    public static Outline createDummy(OutlineType anOutlineType) {
        RecordDate recordDate = RecordDateMock.createDummy(anOutlineType.recotdDateType());
        Address address = AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
        PlayerIds playerIds = PlayerIdsMock.createDummy(PlayerIdsMock.PlayerIdsType.ONE_PLAYER);
        Place place = PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);
        return new Outline(recordDate, address, playerIds, place);
    }

    public enum OutlineType {
        EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.END_OF_LAST_MONTH;
            }
        }, EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.START_OF_THIS_MONTH;
            }
        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.THREE_DAYS_BEFORE;
            }
        }, EVENT_ON_YESTERDAY {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.YESTERDAY;
            }
        }, EVENT_ON_TODAY {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.TODAY;
            }
        }, EVENT_ON_TOMORROW {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.TOMORROW;
            }
        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.THREE_DAYS_AFTER;
            }
        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.END_OF_THIS_MONTH;
            }
        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.START_OF_THIS_MONTH;
            }
        }, DEFAULT {
            @Override
            public RecordDateMock.RecordDateType recotdDateType() {
                return RecordDateMock.RecordDateType.DEFAULT;
            }
        };

        public abstract RecordDateMock.RecordDateType recotdDateType();
    }
}
