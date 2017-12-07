package org.venuspj.studio.generic.fundamentals.line;

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

}
