package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/06/11.
 */
public class ImagePath {
    String value;

    ImagePath() {
    }

    public ImagePath(String aValue) {
        value = aValue;
    }

    public static ImagePath emptyImagePath() {
        return new ImagePath();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
