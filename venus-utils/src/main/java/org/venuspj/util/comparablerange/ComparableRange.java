package org.venuspj.util.comparablerange;

import com.google.common.collect.Range;
import org.venuspj.util.objects2.Objects2;

import java.io.Serializable;

public class ComparableRange<C extends Comparable<?>> implements Serializable {
    private C lowerBound;
    private C upperBound;

    public ComparableRange(C aLowerBound, C anUpperBound) {
        lowerBound = aLowerBound;
        upperBound = anUpperBound;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("lowerBound", lowerBound)
                .add("upperBound", upperBound)
                .omitNullValues()
                .toString();
    }

    public Range<C> greaterThanRange(C endpoint) {
        return Range.greaterThan(lowerBound);
    }

    public Range<C> atLeastRange() {
        return Range.atLeast(lowerBound);
    }

    public Range<C> openRange() {
        return Range.open(lowerBound, upperBound);
    }

    public Range<C> closedRange() {
        return Range.closed(lowerBound, upperBound);
    }

    public Range<C> closedOpenRange() {
        return Range.closedOpen(lowerBound, upperBound);
    }

    public Range<C> openClosedRange() {
        return Range.openClosed(lowerBound, upperBound);
    }

    public Range<C> lessThan() {
        return Range.lessThan(upperBound);
    }

    public Range<C> atMostRange() {
        return Range.atMost(upperBound);
    }

}