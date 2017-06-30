package org.venuspj.cleanArchitecture.useCase;

public interface UseCaseInteractor<I extends UseCaseInputPort, O extends UseCaseOutputPort, UC extends UseCaseInteractor<I, O, UC>> {

    UC withInputPort(I anUseCaseInputPort);

    O start();
}