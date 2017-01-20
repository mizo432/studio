package jp.or.venuspj.ddd.model.repository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Sort implements Serializable, Iterable<Sort.Order> {

    public static class Order{

    }
    public static class NullHandling{

    }
    public static class Direction{

    }
    Sort(List<Order> orders){

    }
    Sort(Sort.Direction direction, List<String> properties){

    }
    Sort(Sort.Direction direction, String... properties){

    }

    Sort(Sort.Order... orders){

    }

    Sort and(Sort sort){

        return sort;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Returns the order registered for the given property.
     * @param property
     * @return
     */
    Sort.Order	getOrderFor(String property){
        return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Iterator<Order> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
