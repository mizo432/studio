package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.address.prefecture.Prefecture;
import org.venuspj.studio.generic.fundamentals.address.prefecture.PrefectureCode;

/**
 */
public class PrefectureMock {

    public static Prefecture createDummy(PrefectureType aPrefectureType) {
        return new Prefecture(aPrefectureType.code(), aPrefectureType.prefectureName());
    }

    public enum PrefectureType {
        KANAGAWA {
            @Override
            public PrefectureCode code() {
                return new PrefectureCode(14);
            }

            @Override
            public String prefectureName() {
                return "神奈川県";
            }
        };

        public abstract PrefectureCode code();

        public abstract String prefectureName();
    }

}
