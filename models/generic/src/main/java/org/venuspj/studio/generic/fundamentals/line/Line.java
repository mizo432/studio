package org.venuspj.studio.generic.fundamentals.line;

public class Line {
    private String value;

    public Line(String aValue) {
        value = aValue;
    }

    Line() {

    }

    public String asText() {
        return value;
    }

    public static Line empty() {
        return new Line();
    }

}
