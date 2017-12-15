package org.venuspj.cleanArchitecture.useCase;

@FunctionalInterface
public interface UseCase<I extends Request, O extends Response> {

    void execute(I request, O response);

}