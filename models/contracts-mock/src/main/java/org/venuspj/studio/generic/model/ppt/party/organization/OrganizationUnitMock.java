package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;

import java.util.UUID;

public class OrganizationUnitMock {
    public static OrganizationUnit createDimmy(OrganizationUnitType anOrganizationUnitType) {

        return new OrganizationUnitImpl(
                anOrganizationUnitType.getOrganizationUnitId(),
                anOrganizationUnitType.unitInfo(),
                anOrganizationUnitType.organization(),
                anOrganizationUnitType.largeUnits(),
                anOrganizationUnitType.smallUnits()

        );
    }

    public enum OrganizationUnitType {

        EMPTY {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.newId(Party.class);
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, STUDIO {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, DEEJEY1 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, DEEJEY2 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, DEEJEY3 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, SOUND1 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, OUTER_BAND1 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        }, OUTER_BAND2 {
            @Override
            public EntityIdentifier<Party> getOrganizationUnitId() {
                return DefaultEntityIdentifier.byUuid(Party.class, UUID.fromString("83821aee-3f73-444b-9824-f7568774f527"));
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        };

        public abstract EntityIdentifier<Party> getOrganizationUnitId();

        public abstract OrganizationUnitInfo unitInfo();

        public abstract Organization organization();

        public abstract OrganizationUnits largeUnits();

        public abstract OrganizationUnits smallUnits();
    }
}
