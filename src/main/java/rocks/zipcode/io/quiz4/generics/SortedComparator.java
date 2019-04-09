package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;

public class SortedComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable) {
            return ((Comparable)o1).compareTo(o2);
        }
        else return 0;
    }
}
