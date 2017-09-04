package org.venuspj.todox.core.model.story.kanoModel;

import static org.venuspj.util.objects2.Objects2.*;

public class KanoModel {
    EmotionIsFilled emotionIsFilled;
    EmotionIsNotFilled emotionIsNotFilled;

    public KanoModel(EmotionIsFilled anEmotionIsFilled, EmotionIsNotFilled anEmotionIsNotFilled) {
        emotionIsFilled = anEmotionIsFilled;
        emotionIsNotFilled = anEmotionIsNotFilled;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("emotionIsFilled", emotionIsFilled)
                .add("emotionIsNotFilled", emotionIsNotFilled)
                .omitNullValues()
                .toString();
    }

    public MustBeQuality mustBeQuality() {
        return MustBeQuality.getValue(emotionIsFilled, emotionIsNotFilled);
    }

    ;

    @Override

    public int hashCode() {
        return hash(emotionIsFilled, emotionIsNotFilled);
    }

    public boolean sameValueAs(KanoModel other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj)) return false;
        if (!(obj instanceof KanoModel)) return false;
        KanoModel that = (KanoModel) obj;
        return equal(emotionIsFilled, that.emotionIsFilled) &&
                equal(emotionIsNotFilled, that.emotionIsNotFilled);
    }
}
