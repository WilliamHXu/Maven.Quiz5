package rocks.zipcode.io.quiz4.generics;


import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable> extends Group<T> {
    @Override
    public void insert(T value) {
        this.list.add(value);
        this.list.sort((o1 ,o2)->{if (o1 instanceof Comparable) {
            return ((Comparable)o1).compareTo(o2);
        }
        else return 0;});
    }

    @Override
    public void delete(T value) {
        this.list.remove(value);
    }

    public Integer indexOf(T value) {
        return super.list.indexOf(value);
    }
}
