package rocks.zipcode.io.quiz4.generics;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements Iterable<T>, GroupInterface<T>{
    protected List<T> list;

    public Group() {
        this.list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    @Override
    public void insert(T value) {
        list.add(value);
    }

    @Override
    public Boolean has(T value) {
        return list.contains(value);
    }

    public T fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(T value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
