package jp.or.venuspj.util.objects2;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

import java.util.Objects;

public class Objects2 {
    public static ToStringHelper toStringHelper(Object self) {
        return MoreObjects.toStringHelper(self);
    }

    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    public static boolean nonNull(Object object) {
        return Objects.nonNull(object);
    }

    public static boolean equal(Object a, Object b) {
        return com.google.common.base.Objects.equal(a,b);
    }

    public static int hash(Object... values) {
        return Objects.hash(values);
    }
}
