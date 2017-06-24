package org.venuspj.studio.core.fundamentals.address;

import org.venuspj.studio.core.fundamentals.address.city.City;
import org.venuspj.studio.core.fundamentals.address.prefecture.Prefecture;
import org.venuspj.util.objects2.Objects2;

public class Address {
    Prefecture prefecture;
    City city;

    public Address(Prefecture aPrefecture, City aCity) {
        prefecture = aPrefecture;
        city = aCity;
    }

    public Address() {

    }

    public static Address nullAddress() {
        return new Address();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("prefecture", prefecture)
                .add("city", city)
                .omitNullValues()
                .toString();
    }

    public static Address defaultAddress() {
        return new Address(Prefecture.defaultPrefecture(), City.defaultCity());
    }
}
