package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.studo.generic.fundamentals.caption.Caption;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Flyer {
    Caption caption = Caption.emptyCaption();
    ImagePath imagePath = ImagePath.emptyImagePath();

    public Flyer(Caption aCaption, ImagePath anImagePath) {
        caption = aCaption;
        imagePath = anImagePath;
    }

    Flyer() {
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("caption", caption)
                .add("imagePath", imagePath)
                .omitNullValues()
                .toString();
    }

    public static Flyer emptyFlyer() {
        return new Flyer();
    }
}
