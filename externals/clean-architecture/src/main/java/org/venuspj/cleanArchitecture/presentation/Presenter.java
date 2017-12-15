package org.venuspj.cleanArchitecture.presentation;

import org.venuspj.cleanArchitecture.useCase.Response;

public interface Presenter<V extends View> extends Response {
    V createView();
}
