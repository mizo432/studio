package org.venuspj.studio.core.usecase.studio;

public interface StudioQueryUseCase {
    StudioQueryUseCase withStudioQueryInputPort(StudioQueryInputPort inputPort);

    StudioQueryUseCase withStudioQueryOutputPort(StudioQueryOutputPort outPort);

    void start();

}
