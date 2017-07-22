package org.venuspj.studio.generic.fundamentals.line;

import org.venuspj.util.objects2.Objects2;

public class Line {
    String value;

    public Line(String aValue) {
        value = aValue;
    }

    Line() {

    }

    public static Line empty() {
        return new Line();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
