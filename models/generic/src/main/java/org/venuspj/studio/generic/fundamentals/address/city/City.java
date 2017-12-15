package org.venuspj.studio.generic.fundamentals.address.city;

import org.venuspj.ddd.model.value.StringValue;

/**
 *
 */
public class City implements StringValue {

    private String value;

    City() {

    }

    public City(String aValue) {
        value = aValue;

    }

    public static City defaultCity() {
        return new City("横浜市");
    }

    @Override
    public String asText() {
        return value;
    }

}
