package org.venuspj.ddd.model.value;

import java.util.List;

public interface ListValue<E> extends Value, Iterable<E> {

    List<E> asList();

}
