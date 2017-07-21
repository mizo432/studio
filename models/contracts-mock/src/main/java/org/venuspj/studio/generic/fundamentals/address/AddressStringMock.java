package org.venuspj.studio.generic.fundamentals.address;

/**
 */
public class AddressStringMock {

    public static AddressString createDummy(AddressStringType anAddressStringType) {
        return new AddressString(anAddressStringType.addressTypeString());
    }

    public enum AddressStringType {
        EMPTY {
            @Override
            public String addressTypeString() {
                return null;
            }
        };

        public abstract String addressTypeString();
    }

}
