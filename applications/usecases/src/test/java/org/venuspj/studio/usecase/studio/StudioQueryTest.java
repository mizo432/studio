package org.venuspj.studio.usecase.studio;

import org.junit.Before;
import org.junit.Test;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepositoryMock;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class StudioQueryTest {

    StudioQueryUseCase studioQueryUseCase;

    @Before
    public void setUp() throws Exception {
        studioQueryUseCase = new StudioQuery(new StudioRepositoryMock());
    }

    @Test
    public void execute() throws Exception {

        StudioQueryPortMock studioQueryPort = new StudioQueryPortMock("LHS");
        studioQueryUseCase.execute(studioQueryPort, studioQueryPort);
        System.out.println("studioQueryPort:" + toStringHelper(studioQueryPort).defaultConfig().toString());
    }

}