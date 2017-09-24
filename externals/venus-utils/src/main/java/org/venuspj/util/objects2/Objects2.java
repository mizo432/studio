package org.venuspj.util.objects2;

import java.util.Arrays;
import java.util.Objects;

import static org.venuspj.util.base.Preconditions.*;

public class Objects2 {

    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    public static boolean nonNull(Object object) {
        return Objects.nonNull(object);
    }

    public static boolean equal(Object a, Object b) {
        return Objects.equals(a, b);
    }

    public static int hash(Object... values) {
        return Objects.hash(values);
    }

    public static ToStringHelper toStringHelper(Class<?> selfClass) {
        return toStringHelper(selfClass.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object self) {
        return new ToStringHelper(self
                .getClass()
                .getSimpleName());
    }


    public static final class ToStringHelper {
        private final String className;
        private final ToStringHelper.ValueHolder holderHead = new ToStringHelper.ValueHolder();
        private ToStringHelper.ValueHolder holderTail = holderHead;
        private boolean omitNullValues = false;

        private ToStringHelper(String className) {
            this.className = checkNotNull(className);
        }

        public ToStringHelper omitNullValues() {
            omitNullValues = true;
            return this;
        }

        public ToStringHelper add(String name, Object value) {
            return addHolder(name, value);
        }

        public ToStringHelper add(String name, boolean value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, char value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, double value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, float value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, int value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper add(String name, long value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(Object value) {
            return addHolder(value);
        }

        public ToStringHelper addValue(boolean value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(char value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(double value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(float value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(int value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper addValue(long value) {
            return addHolder(String.valueOf(value));
        }

        @Override
        public String toString() {
            boolean omitNullValuesSnapshot = omitNullValues;
            String nextSeparator = "";
            StringBuilder builder = new StringBuilder(32)
                    .append(className)
                    .append('{');
            for (ToStringHelper.ValueHolder valueHolder = holderHead.next;
                 valueHolder != null;
                 valueHolder = valueHolder.next) {
                Object value = valueHolder.value;
                if (!omitNullValuesSnapshot || value != null) {
                    builder.append(nextSeparator);
                    nextSeparator = ", ";

                    if (valueHolder.name != null) {
                        builder
                                .append(valueHolder.name)
                                .append('=');
                    }
                    if (value != null && value
                            .getClass()
                            .isArray()) {
                        Object[] objectArray = {value};
                        String arrayString = Arrays.deepToString(objectArray);
                        builder.append(arrayString, 1, arrayString.length() - 1);
                    } else {
                        builder.append(value);
                    }
                }
            }
            return builder
                    .append('}')
                    .toString();
        }

        private ToStringHelper.ValueHolder addHolder() {
            ToStringHelper.ValueHolder valueHolder = new ToStringHelper.ValueHolder();
            holderTail = holderTail.next = valueHolder;
            return valueHolder;
        }

        private ToStringHelper addHolder(Object value) {
            ToStringHelper.ValueHolder valueHolder = addHolder();
            valueHolder.value = value;
            return this;
        }

        private ToStringHelper addHolder(String name, Object value) {
            ToStringHelper.ValueHolder valueHolder = addHolder();
            valueHolder.value = value;
            valueHolder.name = checkNotNull(name);
            return this;
        }

        private static final class ValueHolder {
            String name;
            Object value;
            ToStringHelper.ValueHolder next;
        }
    }

}
