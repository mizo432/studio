package org.venuspj.studio.usecase.studio;

import org.junit.Before;
import org.junit.Test;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCriteria;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studios;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class StudioQueryTest {

    StudioQueryUseCase studioQueryUseCase;

    @Before
    public void setUp() throws Exception {
        StudioRepository aStudioRepository = new StudioRepository() {
            @Override
            public Studio resolve(PartyIdentifier partyIdentifier) {
                return null;
            }

            @Override
            public Studios resolve(StudioCriteria StudioCriteria) {
                return null;
            }
        };
        studioQueryUseCase = new StudioQuery(aStudioRepository);
    }

    @Test
    public void start1() throws Exception {

        StudioQueryPortMock studioQueryPort = new StudioQueryPortMock("LHS");
        studioQueryUseCase.execute(studioQueryPort, studioQueryPort);
        System.out.println("studioQueryPort:" + toStringHelper(studioQueryPort).defaultConfig().toString());
    }

}