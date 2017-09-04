package org.venuspj.todox.core.model.story.kanoModel;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;


public class MustBeQualityTest {
    @Test
    public void getValue1() throws Exception {
        EmotionIsFilled emotionIsFilled = EmotionIsFilled.satisfaction;
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.satisfaction)).isEqualTo(MustBeQuality.questionable);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.like)).isEqualTo(MustBeQuality.exciter);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.neutral)).isEqualTo(MustBeQuality.exciter);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dislike)).isEqualTo(MustBeQuality.exciter);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dissatisfied)).isEqualTo(MustBeQuality.linear);
    }

    @Test
    public void getValue2() throws Exception {
        EmotionIsFilled emotionIsFilled = EmotionIsFilled.like;
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.satisfaction)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.like)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.neutral)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dislike)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dissatisfied)).isEqualTo(MustBeQuality.mandatory);
    }

    @Test
    public void getValue3() throws Exception {
        EmotionIsFilled emotionIsFilled = EmotionIsFilled.neutral;
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.satisfaction)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.like)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.neutral)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dislike)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dissatisfied)).isEqualTo(MustBeQuality.mandatory);
    }

    @Test
    public void getValue4() throws Exception {
        EmotionIsFilled emotionIsFilled = EmotionIsFilled.dislike;
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.satisfaction)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.like)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.neutral)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dislike)).isEqualTo(MustBeQuality.indifferent);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dissatisfied)).isEqualTo(MustBeQuality.mandatory);
    }

    @Test
    public void getValue5() throws Exception {
        EmotionIsFilled emotionIsFilled = EmotionIsFilled.dissatisfied;
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.satisfaction)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.like)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.neutral)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dislike)).isEqualTo(MustBeQuality.reverse);
        assertThat(MustBeQuality.getValue(emotionIsFilled, EmotionIsNotFilled.dissatisfied)).isEqualTo(MustBeQuality.questionable);
    }

    @Test
    public void toString1() throws Exception {
        System.out.println(MustBeQuality.mandatory);
        System.out.println(MustBeQuality.linear);
        System.out.println(MustBeQuality.exciter);
        System.out.println(MustBeQuality.reverse);
        System.out.println(MustBeQuality.indifferent);
        System.out.println(MustBeQuality.questionable);
    }
}