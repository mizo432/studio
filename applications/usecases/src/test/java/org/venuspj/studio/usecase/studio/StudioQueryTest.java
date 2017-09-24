package org.venuspj.studio.usecase.studio;

import org.junit.Before;
import org.junit.Test;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepositoryMock;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;

import static org.venuspj.util.collect.Lists2.*;

/**
 */
public class StudioQueryTest {

    StudioQueryUseCase studioQueryUseCase;

    @Before
    public void setUp() throws Exception {
        StudioRepository studioRepository
                = new StudioRepositoryMock(newArrayList(StudioMock.createDummy()));
        studioQueryUseCase = new StudioQuery(studioRepository);
    }

    @Test
    public void start1() throws Exception {
        StudioQueryPortMock studioQueryPort = new StudioQueryPortMock("LHS");
        studioQueryUseCase.
                withStudioQueryInputPort(studioQueryPort).
                withStudioQueryOutputPort(studioQueryPort).
                start();
        System.out.println("studioQueryPort" + studioQueryPort.toString());
    }

}