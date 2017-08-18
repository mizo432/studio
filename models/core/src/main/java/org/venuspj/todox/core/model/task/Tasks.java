package org.venuspj.todox.core.model.task;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.util.collect.Lists2;

import java.util.List;

public class Tasks extends AbstractEntity<Tasks>{
    List<Task> list = Lists2.newArrayList();

    public Tasks(List<Task> alist){
        list.addAll(list);
    }

    Tasks() {

    }

    public static Tasks empry() {
        return new Tasks();
    }
}
