package org.venuspj.studio.usecase.studio;

import org.junit.Before;
import org.junit.Test;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;

/**
 */
public class StudioQueryTest {

    StudioQueryUseCase studioQueryUseCase;

    @Before
    public void setUp() throws Exception {
        studioQueryUseCase = new StudioQuery();
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