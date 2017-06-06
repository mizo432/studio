package jp.or.venuspj.image.core.fundamentals.path;

import jp.or.venuspj.util.objects2.Objects2;
import jp.or.venuspj.util.strings2.Strings2;

public class Path {
    public static final Path DEFAULT = new Path();

    String value;

    Path(){}

    public Path(String aValue){
        value = aValue;
    }

    public boolean isEmpty() {
        return Objects2.nonNull(value) && Strings2.isEmpty(value);
    }
}
