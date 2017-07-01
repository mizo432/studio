package org.venuspj.studio.generic.fundamentals.address.city;

import org.venuspj.ddd.model.value.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public class City implements StringValue {

    private String value;

    City(){

    }

    public City(String aValue){
        value = aValue;

    }

    public static City defaultCity() {
        return new City("横浜市");
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .omitNullValues()
                .toString();
    }
}
