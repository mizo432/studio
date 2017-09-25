package org.venuspj.studio.generic.fundamentals.location;

import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.code.Code;

import static org.venuspj.util.objects2.Objects2.isNull;

public enum Region {
    hokkaido("rgn01", "北海道"),
    tohoku("rgn02", "東北"),
    kantou("rgn04", "関東"),
    koushinetsu("rgn05", "甲信越"),
    hokuriku("rgn06", "北陸"),
    tokai("rgn07", "東海"),
    kansai("rgn08", "関西"),
    saninsanyo("rgn09", "山陰・山陽"),
    shikoku("rgn10", "四国"),
    kyushu("rgn11", "九州"),
    okinawa("rgn12", "沖縄"),

    kokugai("rgn99", "（日本国外）"),

    unknown("", "");

    Code code;
    Caption label;

    Region(String code, String label) {
        this.code = new Code(code);
        this.label = new Caption(label);
    }

    public static Region of(String label) {
        if (isNull(label)) return unknown;
        for (Region region : Region.values()) {
            if (region.label.equals(label)) return region;
        }
        return unknown;
    }

    public static Region findBy(Code code) {
        if (isNull(code)) return unknown;
        for (Region region : Region.values()) {
            if (region.code.equals(code)) return region;
        }
        return unknown;
    }

    public boolean isSameCode(String code) {
        return this.code.equals(code);
    }

    public Code code() {
        return code;
    }

    public Caption label() {
        return label;
    }

    public boolean isUnknown() {
        return this == unknown;
    }

}