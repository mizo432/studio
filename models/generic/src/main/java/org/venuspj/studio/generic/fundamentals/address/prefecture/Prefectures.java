package org.venuspj.studio.generic.fundamentals.address.prefecture;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class Prefectures {
    List<Prefecture> list = newArrayListWithCapacity(47);

    public Prefectures(List<Prefecture> anylist) {
        list.addAll(anylist);
    }

    public static Prefectures allPrefecture() {
        List<Prefecture> list = newArrayListWithCapacity(47);
        list.add(Prefecture.hokkaido);
        list.add(Prefecture.aomori);
        list.add(Prefecture.iwate);
        list.add(Prefecture.miyagi);
        list.add(Prefecture.akita);
        list.add(Prefecture.yamagata);
        list.add(Prefecture.fukushima);
        list.add(Prefecture.ibaraki);
        list.add(Prefecture.tochigi);
        list.add(Prefecture.gunma);
        list.add(Prefecture.saitama);
        list.add(Prefecture.chiba);
        list.add(Prefecture.tokyo);
        list.add(Prefecture.kanagawa);
        list.add(Prefecture.niigata);
        list.add(Prefecture.toyama);
        list.add(Prefecture.ishikawa);
        list.add(Prefecture.fukui);
        list.add(Prefecture.yamanashi);
        list.add(Prefecture.nagano);
        list.add(Prefecture.gifu);
        list.add(Prefecture.shizuoka);
        list.add(Prefecture.aichi);
        list.add(Prefecture.mie);
        list.add(Prefecture.shiga);
        list.add(Prefecture.kyoto);
        list.add(Prefecture.osaka);
        list.add(Prefecture.hyogo);
        list.add(Prefecture.nara);
        list.add(Prefecture.wakayama);
        list.add(Prefecture.tottori);
        list.add(Prefecture.shimane);
        list.add(Prefecture.okayama);
        list.add(Prefecture.hiroshima);
        list.add(Prefecture.yamaguchi);
        list.add(Prefecture.tokushima);
        list.add(Prefecture.kagawa);
        list.add(Prefecture.ehime);
        list.add(Prefecture.kochi);
        list.add(Prefecture.fukuoka);
        list.add(Prefecture.saga);
        list.add(Prefecture.nagasaki);
        list.add(Prefecture.kumamoto);
        list.add(Prefecture.oita);
        list.add(Prefecture.miyazaki);
        list.add(Prefecture.kagoshima);
        list.add(Prefecture.okinawa);
        return new Prefectures(list);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
