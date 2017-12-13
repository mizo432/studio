package org.venuspj.studio.generic.model.ppt.party;

public class PartyIdentifierMock {
    public static PartyIdentifier createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        LHS {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(1);
            }
        }, DEEJEY1 {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(2);
            }
        }, DEEJEY2 {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(3);
            }
        }, DEEJEY3 {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(4);
            }
        }, SOUND1 {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(5);
            }
        }, SOUND2 {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(6);
            }
        }, SOUND3_OUTER {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(7);
            }
        }, DEEJEY4_OUTER {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(8);
            }
        }, OUTER {
            @Override
            public PartyIdentifier create() {
                return new PartyIdentifier(9);
            }
        };

        public abstract PartyIdentifier create();
    }
}
