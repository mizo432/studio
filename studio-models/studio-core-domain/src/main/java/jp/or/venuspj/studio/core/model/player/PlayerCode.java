package jp.or.venuspj.studio.core.model.player;

import jp.or.venuspj.util.objects2.Objects2;

public class PlayerCode {
    String value;

    PlayerCode() {
    }

    public PlayerCode(String aValue) {
        value = aValue;
    }

    public static PlayerCode defaultCode() {
        return new PlayerCode();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
