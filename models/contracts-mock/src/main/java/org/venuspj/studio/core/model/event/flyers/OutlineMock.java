package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.ddd.model.entity.EntityIdentifiers;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayersMock;
import org.venuspj.studio.generic.fundamentals.address.Address;
import org.venuspj.studio.generic.fundamentals.address.AddressMock;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.ppt.place.PlaceMock;

public class OutlineMock {
    public static Outline createDummy(OutlineType anOutlineType) {
        return anOutlineType.createDummy();
    }

    public enum OutlineType {
        EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.END_OF_LAST_MONTH);
            }
        },
        EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.START_OF_THIS_MONTH);
            }

            @Override
            public Address getAddress() {
                return AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
            }

            @Override
            public EntityIdentifiers<Party> getOrganizationUnitIds() {
                return PlayersMock.createDummy(PlayersMock.PlayersType.ANY_PLAYERS).identifiers();
            }

            @Override
            public Place getPlace() {
                return PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);

            }
        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.THREE_DAYS_BEFORE);
            }

            @Override
            public Address getAddress() {
                return AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
            }

            @Override
            public EntityIdentifiers<Party> getOrganizationUnitIds() {
                return PlayersMock.createDummy(PlayersMock.PlayersType.ANY_PLAYERS).identifiers();
            }

            @Override
            public Place getPlace() {
                return PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);
            }
        }, EVENT_ON_YESTERDAY {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.YESTERDAY);
            }

            @Override
            public Address getAddress() {
                return AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
            }

            @Override
            public EntityIdentifiers<Party> getOrganizationUnitIds() {
                return PlayersMock.createDummy(PlayersMock.PlayersType.ANY_PLAYERS).identifiers();
            }

            @Override
            public Place getPlace() {
                return PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);
            }
        }, EVENT_ON_TODAY {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.TODAY);
            }

            @Override
            public Address getAddress() {
                return AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
            }


        }, EVENT_ON_TOMORROW {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.TOMORROW);
            }
        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.THREE_DAYS_AFTER);
            }
        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.END_OF_THIS_MONTH);
            }
        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.START_OF_NEXT_MONTH);
            }
        }, DEFAULT {
            @Override
            public RecordDate getRecordDate() {
                return RecordDateMock.createDummy(RecordDateMock.RecordDateType.DEFAULT);
            }
        };

        public abstract RecordDate getRecordDate();

        public Address getAddress() {
            return AddressMock.createDummy(AddressMock.AddressType.DEFAULT);
        }

        public EntityIdentifiers<Party> getOrganizationUnitIds() {
            return PlayersMock.createDummy(PlayersMock.PlayersType.ANY_PLAYERS).identifiers();

        }

        public Place getPlace() {
            return PlaceMock.createDummy(PlaceMock.PlaceType.EMPTY);
        }

        public Outline createDummy() {
            return new Outline(getRecordDate(),
                    getAddress(),
                    getOrganizationUnitIds(),
                    getPlace());

        }
    }
}
