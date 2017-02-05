package jp.or.venuspj.ColorUml.domain.fundamentals.Note;

import jp.or.venuspj.ddd.model.value.StringValue;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class Note implements StringValue {
    String value;

    Note() {

    }

    public Note(String aValue) {
        value = aValue;

    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
