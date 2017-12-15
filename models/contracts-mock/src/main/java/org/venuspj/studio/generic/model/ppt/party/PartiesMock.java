package org.venuspj.studio.generic.model.ppt.party;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PartiesMock {
    public static Parties create(MockType aMockType) {
        List<Party> result = newArrayList();

        for (PartyMock.MockType partyMockType : aMockType.getPartyMockTypes())
            result.add(PartyMock.createMock(partyMockType));

        return new Parties(result);

    }

    public enum MockType {
        ALL {
            @Override
            public PartyMock.MockType[] getPartyMockTypes() {
                return PartyMock.MockType.values();
            }
        }, PLAYERS {
            @Override
            public PartyMock.MockType[] getPartyMockTypes() {
                return new PartyMock.MockType[]{PartyMock.MockType.DEEJEY1,
                        PartyMock.MockType.DEEJEY2,
                        PartyMock.MockType.DEEJEY3,
                        PartyMock.MockType.SOUND1,
                        PartyMock.MockType.SOUND2,
                };
            }
        }, STUDIO_PLAYERS {
            @Override
            public PartyMock.MockType[] getPartyMockTypes() {
                return new PartyMock.MockType[]{PartyMock.MockType.DEEJEY1,
                        PartyMock.MockType.DEEJEY2,
                        PartyMock.MockType.DEEJEY3,
                        PartyMock.MockType.SOUND1,
                        PartyMock.MockType.SOUND2,
                };
            }
        }, ALL_PLAYERS {
            @Override
            public PartyMock.MockType[] getPartyMockTypes() {
                return new PartyMock.MockType[]{PartyMock.MockType.DEEJEY1,
                        PartyMock.MockType.DEEJEY2,
                        PartyMock.MockType.DEEJEY3,
                        PartyMock.MockType.DEEJEY4_OUTER,
                        PartyMock.MockType.SOUND1,
                        PartyMock.MockType.SOUND2,
                        PartyMock.MockType.SOUND3_OUTER
                };
            }
        }, OUTER_PLAYERS {
            @Override
            public PartyMock.MockType[] getPartyMockTypes() {
                return new PartyMock.MockType[]{
                        PartyMock.MockType.DEEJEY4_OUTER,
                        PartyMock.MockType.SOUND3_OUTER
                };
            }
        };

        public abstract PartyMock.MockType[] getPartyMockTypes();
    }
}
