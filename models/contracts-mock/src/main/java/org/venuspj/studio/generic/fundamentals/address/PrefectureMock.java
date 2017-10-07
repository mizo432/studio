package org.venuspj.studio.generic.fundamentals.address;

import org.venuspj.studio.generic.fundamentals.address.prefecture.Prefecture;

/**
 */
public class PrefectureMock {

    public static Prefecture createDummy(PrefectureType aPrefectureType) {
        return Prefecture.kanagawa;
    }

    public enum PrefectureType {
        KANAGAWA;
    }

}
