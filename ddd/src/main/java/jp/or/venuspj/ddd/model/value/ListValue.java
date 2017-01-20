package jp.or.venuspj.ddd.model.value;

import java.util.List;

public interface ListValue<E> extends Value {

    List<E> asList();

}
