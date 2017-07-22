package org.venuspj.studio.generic.fundamentals.quantity;

import org.venuspj.util.objects2.Objects2;

/**
 */
public class Quantity {
    Integer value = 0;
    Unit unit = Unit.unknown();

    Quantity() {
    }

    Quantity(Integer aValue, Unit anUnit) {
        value = aValue;
        unit = anUnit;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("value", value)
                .add("unit", unit)
                .omitNullValues()
                .toString();
    }
}
