package org.venuspj.studio.generic.fundamentals.quantity;

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

}
