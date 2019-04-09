package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet implements Comparable {
    public ComparableTreeSet(T... arr) {
        super();
        addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        super();
    }

    public int compareTo(ComparableTreeSet<T> o) {
        ComparableTreeSet set1 = (ComparableTreeSet) this.clone();
        ArrayList<T> arrayList1 = new ArrayList<>(this);
        ArrayList<T> arrayList2 = new ArrayList<>(o);
        for (int i = 0; i < arrayList1.size(); i++) {
            Comparable check = (Comparable) arrayList1.get(i);
            int j = check.compareTo(arrayList2.get(i));
            if(j != 0) {
                return j;
            }
        }
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ComparableTreeSet){
            return compareTo((ComparableTreeSet<T>) o);
        }
        return 0;
    }
}
