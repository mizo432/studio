package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.venuspj.util.collect.Lists2;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class Prefectures {
    List<Prefecture> list = Lists2.newArrayListWithExpectedSize(47);

    Prefectures() {

    }

    public Prefectures(List<Prefecture> anyList) {
        list.addAll(anyList);
    }

    public static Prefectures allPrefecture() {
        List<Prefecture> list = newArrayListWithCapacity(47);
        list.add(new Prefecture(new PrefectureCode(1), "北海道"));
        list.add(new Prefecture(new PrefectureCode(2), "青森県"));
        list.add(new Prefecture(new PrefectureCode(3), "岩手県"));
        list.add(new Prefecture(new PrefectureCode(4), "宮城県"));
        list.add(new Prefecture(new PrefectureCode(5), "秋田県"));
        list.add(new Prefecture(new PrefectureCode(6), "山形県"));
        list.add(new Prefecture(new PrefectureCode(7), "福島県"));
        list.add(new Prefecture(new PrefectureCode(8), "茨城県"));
        list.add(new Prefecture(new PrefectureCode(9), "栃木県"));
        list.add(new Prefecture(new PrefectureCode(10), "群馬県"));
        list.add(new Prefecture(new PrefectureCode(11), "埼玉県"));
        list.add(new Prefecture(new PrefectureCode(12), "千葉県"));
        list.add(new Prefecture(new PrefectureCode(13), "東京都"));
        list.add(new Prefecture(new PrefectureCode(14), "神奈川県"));
        list.add(new Prefecture(new PrefectureCode(15), "新潟県"));
        list.add(new Prefecture(new PrefectureCode(16), "富山県"));
        list.add(new Prefecture(new PrefectureCode(17), "石川県"));
        list.add(new Prefecture(new PrefectureCode(18), "福井県"));
        list.add(new Prefecture(new PrefectureCode(19), "山梨県"));
        list.add(new Prefecture(new PrefectureCode(20), "長野県"));
        list.add(new Prefecture(new PrefectureCode(21), "岐阜県"));
        list.add(new Prefecture(new PrefectureCode(22), "静岡県"));
        list.add(new Prefecture(new PrefectureCode(23), "愛知県"));
        list.add(new Prefecture(new PrefectureCode(24), "三重県"));
        list.add(new Prefecture(new PrefectureCode(25), "滋賀県"));
        list.add(new Prefecture(new PrefectureCode(26), "京都府"));
        list.add(new Prefecture(new PrefectureCode(27), "大阪府"));
        list.add(new Prefecture(new PrefectureCode(28), "兵庫県"));
        list.add(new Prefecture(new PrefectureCode(29), "奈良県"));
        list.add(new Prefecture(new PrefectureCode(30), "和歌山県"));
        list.add(new Prefecture(new PrefectureCode(31), "鳥取県"));
        list.add(new Prefecture(new PrefectureCode(32), "島根県"));
        list.add(new Prefecture(new PrefectureCode(33), "岡山県"));
        list.add(new Prefecture(new PrefectureCode(34), "広島県"));
        list.add(new Prefecture(new PrefectureCode(35), "山口県"));
        list.add(new Prefecture(new PrefectureCode(36), "徳島県"));
        list.add(new Prefecture(new PrefectureCode(37), "香川県"));
        list.add(new Prefecture(new PrefectureCode(38), "愛媛県"));
        list.add(new Prefecture(new PrefectureCode(39), "高知県"));
        list.add(new Prefecture(new PrefectureCode(40), "福岡県"));
        list.add(new Prefecture(new PrefectureCode(41), "佐賀県"));
        list.add(new Prefecture(new PrefectureCode(42), "長崎県"));
        list.add(new Prefecture(new PrefectureCode(43), "熊本県"));
        list.add(new Prefecture(new PrefectureCode(44), "大分県"));
        list.add(new Prefecture(new PrefectureCode(45), "宮崎県"));
        list.add(new Prefecture(new PrefectureCode(46), "鹿児島県"));
        list.add(new Prefecture(new PrefectureCode(47), "沖縄県"));
        return new Prefectures(list);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
