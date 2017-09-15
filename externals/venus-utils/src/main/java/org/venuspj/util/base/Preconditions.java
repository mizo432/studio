package org.venuspj.util.base;


import static java.lang.String.format;

public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    public static <T> T checkNotNull(T reference, String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }
        return reference;
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void checkState(
            boolean expression,
            String errorMessageTemplate,
            Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(format(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, char p1) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, int p1) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, long p1) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, Object p1) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, char p1, char p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, char p1, int p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, char p1, long p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, char p1, Object p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, int p1, char p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, int p1, int p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, int p1, long p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, int p1, Object p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, long p1, char p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean b, String errorMessageTemplate, long p1, int p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, long p1, long p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, long p1, Object p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, Object p1, char p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, Object p1, int p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, Object p1, long p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b, String errorMessageTemplate, Object p1, Object p2) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(
            boolean b,
            String errorMessageTemplate,
            Object p1,
            Object p2,
            Object p3) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void checkState(
            boolean b,
            String errorMessageTemplate,
            Object p1,
            Object p2,
            Object p3,
            Object p4) {
        if (!b) {
            throw new IllegalStateException(format(errorMessageTemplate, p1, p2, p3, p4));
        }
    }
}
