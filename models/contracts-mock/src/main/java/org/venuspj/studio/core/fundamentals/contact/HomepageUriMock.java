package org.venuspj.studio.core.fundamentals.contact;

import java.net.URI;

public class HomepageUriMock {
    public static HomepageUri createDummy(HomepageUriType aHomepageUriType) {
        return new HomepageUri(aHomepageUriType.uri());
    }

    public enum HomepageUriType {
        EMPTY {
            @Override
            public URI uri() {
                return null;
            }
        }, DEFAULT {
            @Override
            public URI uri() {
                return URI.create("http://www.yahoo.co.jp");
            }
        };

        public abstract URI uri();
    }
}
