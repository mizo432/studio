package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.util.strings2.Strings2;

/**
 */
public class DescriptionMock {
    public static Description createDummy(DescriptionType anDescriptionType) {
        return new Description(anDescriptionType.text());
    }

    public enum DescriptionType {
        EVENT_DESCRIPTION_ON_END_OF_LAST_MONTH, EVENT_DESCRIPTION_ON_START_OF_THIS_MONTH, EVENT_DESCRIPTION_ON_YESTERDAY,
        EVENT_DESCRIPTION_ON_TODAY, EVENT_DESCRIPTION_ON_THREE_DAYS_AFTER, EVENT_DESCRIPTION_ON_END_OF_THIS_MONTH,
        EVENT_DESCRIPTION_ON_START_OF_NEXT_MONTH, DEFAULT, STUDIO {
            @Override
            public String text() {
                return new StringBuilder()
                        .append("REGGAE TOWN「横浜」その最北端「鶴見」で生まれ育ったメンバーを中心に始動。").append("\n")
                        .append("\n")
                        .append("2009年9月").append("\n")
                        .append("一軒家を共有（シェア）し「LIONHOUSE STUDIO」を設立。").append("\n")
                        .append("神奈川のアーティストを中心にDub Studioとして活動を始める。").append("\n")
                        .append("\n")
                        .append("一軒家を共有（シェア）というStyleもあってか良きLinkの場となり、様々な「神奈川アーティスト」が録れるStudioと言われるほどに成長。").append("\n")
                        .append("数々のDub Mix CDへ、その録音物で参加する。").append("\n")
                        .append("\n")
                        .append("2012年9月").append("\n")
                        .append("Dub・Demoの枠に留まらず「正規音源の制作を手掛けたい」そんな思いからStudio機材を一新。").append("\n")
                        .append("\n")
                        .append("2014年8月").append("\n")
                        .append("1st Mix CD 「LIONHOUSE STUDIO #1-inna de DANCEHALL-」を発売。").append("\n")
                        .append("\n")
                        .append("2015年5月").append("\n")
                        .append("EVENT『YOFUKASHI』を新横浜 Funky にて主催する。（不定期開催）").append("\n")
                        .toString();
            }
        }, ALBUM1, EVENT_DESCRIPTION_ON_TOMORROW, EVENT_DESCRIPTION_ON_ON_THREE_DAYS_BEFORE, ALBUM2, ALBUM3, NEWS1_DESCRIPTION;

        public String text() {
            return Strings2.repeat(name() + ", ", 10);
        }
    }
}
