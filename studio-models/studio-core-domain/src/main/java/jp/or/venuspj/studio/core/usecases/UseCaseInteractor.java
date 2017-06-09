package jp.or.venuspj.studio.core.usecases;

public interface UseCaseInteractor<I extends UseCaseInputPort, O extends UseCaseOutputPort> {
    UseCaseInteractor withInputPort(I anUseCaseInputPort, O anUseCaseOutputPort);

    void start();
}