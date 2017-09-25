package org.venuspj.studio.generic.fundamentals.address;

import org.venuspj.studio.generic.fundamentals.address.city.City;
import org.venuspj.studio.generic.fundamentals.address.prefecture.Prefecture;
import org.venuspj.studio.generic.fundamentals.geographic.MapPosition;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Address {
    Prefecture prefecture;
    City city;
    AddressString addressString;
    MapPosition mapPosition;

    public Address(Prefecture aPrefecture, City aCity, AddressString anAddressString, MapPosition aMapPosition) {
        prefecture = aPrefecture;
        city = aCity;
        addressString = anAddressString;
        mapPosition = aMapPosition;
    }

    public Address() {

    }

    public static Address nullAddress() {
        return new Address();
    }

    public static Address defaultAddress() {
        return new Address(Prefecture.defaultPrefecture(), City.defaultCity(), AddressString.emptyAddressString(), MapPosition.emptyMapPosition());
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("prefecture", prefecture)
                .add("city", city)
                .add("addressString", addressString)
                .add("mapPosition", mapPosition)
                .omitNullValues()
                .toString();
    }
}
