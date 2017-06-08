package jp.or.venuspj.studio.adapter.presenters;

public class UseCaseInteractor {
    UseCaseInputPort useCaseInputPort;
    UseCaseOutputPort useCaseOutputPort;

    public UseCaseInteractor withInputPort(UseCaseInputPort anUseCaseInputPort, UseCaseOutputPort anUseCaseOutputPort) {
        useCaseInputPort = anUseCaseInputPort;
        useCaseOutputPort = anUseCaseOutputPort;
        return this;
    }

    public void start() {

    }

}
