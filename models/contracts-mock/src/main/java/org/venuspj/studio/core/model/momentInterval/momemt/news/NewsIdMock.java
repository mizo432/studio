package org.venuspj.studio.core.model.momentInterval.momemt.news;

/**
 */
public class NewsIdMock {
    public static NewsId createDummy(NewsIdType aNewsIDType) {
        return new NewsId(aNewsIDType.idValue());
    }

    public static enum NewsIdType {
        DEFAULT {
            @Override
            public Integer idValue() {
                return 1;
            }
        };

        public abstract Integer idValue();
    }
}
