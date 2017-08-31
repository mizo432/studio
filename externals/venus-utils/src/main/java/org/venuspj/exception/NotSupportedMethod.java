package org.venuspj.exception;

public class NotSupportedMethod extends RuntimeException {

    public NotSupportedMethod(String message) {
        super(message);
    }

    public NotSupportedMethod(String message, Throwable t) {
        super(message, t);
    }

    public NotSupportedMethod(Throwable t) {
        super(t);
    }


}
