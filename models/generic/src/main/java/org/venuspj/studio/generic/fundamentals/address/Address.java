package org.venuspj.studio.generic.fundamentals.address;

import org.venuspj.studio.generic.fundamentals.address.city.City;
import org.venuspj.studio.generic.fundamentals.address.prefecture.Prefecture;
import org.venuspj.util.objects2.Objects2;

public class Address {
    Prefecture prefecture;
    City city;
    AddressString addressString;

    public Address(Prefecture aPrefecture, City aCity, AddressString anAddressString) {
        prefecture = aPrefecture;
        city = aCity;
        addressString = anAddressString;
    }

    public Address() {

    }

    public static Address nullAddress() {
        return new Address();
    }

    public static Address defaultAddress() {
        return new Address(Prefecture.defaultPrefecture(), City.defaultCity(), AddressString.emptyAddressString());
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("prefecture", prefecture)
                .add("city", city)
                .add("addressString", addressString)
                .omitNullValues()
                .toString();
    }
}
