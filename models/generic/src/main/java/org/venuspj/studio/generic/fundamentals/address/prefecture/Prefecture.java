package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.venuspj.studio.generic.fundamentals.location.Region;
import org.venuspj.util.objects2.Objects2;

/**
 */
public enum Prefecture {
    hokkaido("prf010000", "北海道", Region.hokkaido),
    aomori("prf020000", "青森県", Region.tohoku),
    iwate("prf030000", "岩手県", Region.tohoku),
    miyagi("prf040000", "宮城県", Region.tohoku),
    akita("prf050000", "秋田県", Region.tohoku),
    yamagata("prf060000", "山形県", Region.tohoku),
    fukushima("prf070000", "福島県", Region.tohoku),

    tochigi("prf080000", "栃木県", Region.kantou),
    gunma("prf090000", "群馬県", Region.kantou),
    ibaraki("prf100000", "茨城県", Region.kantou),
    saitama("prf110000", "埼玉県", Region.kantou),
    chiba("prf120000", "千葉県", Region.kantou),
    tokyo("prf130000", "東京都", Region.kantou),
    kanagawa("prf140000", "神奈川県", Region.kantou),

    yamanashi("prf150000", "山梨県", Region.koushinetsu),
    nagano("prf160000", "長野県", Region.koushinetsu),
    niigata("prf170000", "新潟県", Region.koushinetsu),

    toyama("prf180000", "富山県", Region.hokuriku),
    ishikawa("prf190000", "石川県", Region.hokuriku),
    fukui("prf200000", "福井県", Region.hokuriku),

    shizuoka("prf210000", "静岡県", Region.tokai),
    gifu("prf220000", "岐阜県", Region.tokai),
    aichi("prf230000", "愛知県", Region.tokai),
    mie("prf240000", "三重県", Region.tokai),

    shiga("prf250000", "滋賀県", Region.kansai),
    kyoto("prf260000", "京都府", Region.kansai),
    osaka("prf270000", "大阪府", Region.kansai),
    hyogo("prf280000", "兵庫県", Region.kansai),
    nara("prf290000", "奈良県", Region.kansai),
    wakayama("prf300000", "和歌山県", Region.kansai),

    tottori("prf310000", "鳥取県", Region.saninsanyo),
    shimane("prf320000", "島根県", Region.saninsanyo),
    okayama("prf330000", "岡山県", Region.saninsanyo),
    hiroshima("prf340000", "広島県", Region.saninsanyo),
    yamaguchi("prf350000", "山口県", Region.saninsanyo),

    tokushima("prf360000", "徳島県", Region.shikoku),
    kagawa("prf370000", "香川県", Region.shikoku),
    ehime("prf380000", "愛媛県", Region.shikoku),
    kochi("prf390000", "高知県", Region.shikoku),

    fukuoka("prf400000", "福岡県", Region.kyushu),
    saga("prf410000", "佐賀県", Region.kyushu),
    nagasaki("prf420000", "長崎県", Region.kyushu),
    kumamoto("prf430000", "熊本県", Region.kyushu),
    oita("prf440000", "大分県", Region.kyushu),
    miyazaki("prf450000", "宮崎県", Region.kyushu),
    kagoshima("prf460000", "鹿児島県", Region.kyushu),

    okinawa("prf470000", "沖縄県", Region.okinawa),

    kokugai("prf990000", "（日本国外）", Region.kokugai),

    unknown("", "", Region.unknown);

    PrefectureCode prefectureCode;
    Region region;
    private String value;

    Prefecture() {
    }

    Prefecture(String aPrefectureCode, String aValue, Region aRegion) {
        value = aValue;
        prefectureCode = new PrefectureCode(aPrefectureCode);
        region = aRegion;
    }

    public static Prefecture defaultPrefecture() {
        return kagawa;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("code", prefectureCode)
                .add("name", value)
                .toString();
    }

}
