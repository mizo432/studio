package org.venuspj.studio.usecase.studio;

import org.junit.Before;
import org.junit.Test;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioMock;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;
import org.venuspj.util.collect.Lists2;

/**
 */
public class StudioQueryTest {

    StudioQueryUseCase studioQueryUseCase;

    @Before
    public void setUp() throws Exception {
        OnMemoryCrudRepository<Studio> studioRepository
                = new OnMemoryCrudRepository<>(Lists2.newArrayList(StudioMock.createDummy()));
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