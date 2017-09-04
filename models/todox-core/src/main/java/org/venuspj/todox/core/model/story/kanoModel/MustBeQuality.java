package org.venuspj.todox.core.model.story.kanoModel;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.venuspj.util.objects2.Objects2.*;

public enum MustBeQuality {
    mandatory(new Name("基本"), new Description("なくてはならないもの。外せないもの。"), new Description("効果点が高いものから順次開発していく")),
    linear(new Name("性能"), new Description("なくてもよいが、あればあるほど良い。"), new Description("効果点が高いものから順にスプリントに1ストーリー」を目安に-取り込んでいく")),
    exciter(new Name("魅力"), new Description("いわゆる差別化ポイント。"), new Description("効果点が高いものから順に「3スプリントに1ストーリー」を目安に取り込んでいくと良い")),
    questionable(new Name("不明"), new Description("回答がおかしい。"), new Description("回答を見直す")),
    reverse(new Name("逆行"), new Description("あっては困る。つまり作ってはいかん。"), new Description("作ってはいけない。")),
    indifferent(new Name("不問"), new Description("どうでもよい。作ってもいいが作らなくても良い。"), new Description("作る必要はない。"));

    private final Name name;
    private final Description description;
    private final Description action;

    MustBeQuality(Name aName, Description aDescription, Description anAction) {
        name = aName;
        description = aDescription;
        action = anAction;
    }

    public static MustBeQuality getValue(EmotionIsFilled anEmotionIsFilled, EmotionIsNotFilled anEmotionIsNotFilled) {
        switch (anEmotionIsFilled) {
            case satisfaction:
                //満たした時の感情が満足
                switch (anEmotionIsNotFilled) {
                    case satisfaction:
                        // 満たさない時の感情が満足
                        return MustBeQuality.questionable;
                    case like:
                        // 満たさない時の感情が好感
                        return MustBeQuality.exciter;
                    case neutral:
                        // 満たさない時の感情が普通
                        return MustBeQuality.exciter;
                    case dislike:
                        // 満たさない時の感情が普通
                        return MustBeQuality.exciter;
                    default:
                        return MustBeQuality.linear;

                }
            case like:
            case neutral:
            case dislike:
                //満たした時の感情が満足
                switch (anEmotionIsNotFilled) {
                    case satisfaction:
                        // 満たさない時の感情が満足
                        return MustBeQuality.reverse;
                    case like:
                        // 満たさない時の感情が好感
                        return MustBeQuality.indifferent;
                    case neutral:
                        // 満たさない時の感情が普通
                        return MustBeQuality.indifferent;
                    case dislike:
                        // 満たさない時の感情が普通
                        return MustBeQuality.indifferent;
                    default:
                        return MustBeQuality.mandatory;

                }
            default:
                //満たした時の感情が満足
                switch (anEmotionIsNotFilled) {
                    case satisfaction:
                        // 満たさない時の感情が満足
                        return MustBeQuality.reverse;
                    case like:
                        // 満たさない時の感情が好感
                        return MustBeQuality.reverse;
                    case neutral:
                        // 満たさない時の感情が普通
                        return MustBeQuality.reverse;
                    case dislike:
                        // 満たさない時の感情が普通
                        return MustBeQuality.reverse;
                    default:
                        return MustBeQuality.questionable;

                }
        }
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("name", name)
                .add("description", description)
                .add("action", action)
                .omitNullValues()
                .toString();
    }
}
