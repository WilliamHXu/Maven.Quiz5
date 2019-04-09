package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SetComparator<T> implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Set && o2 instanceof Set){
            ArrayList list1 = (ArrayList) o1;
            ArrayList list2 = (ArrayList) o2;
            if (!list1.get(0).equals(list2.get(0))){
                return ((Comparable)list1.get(0)).compareTo(((Comparable)list2.get(0)));
            }
            else {
                return ((Integer)list1.size()).compareTo(((Integer)list2.size()));
            }
        }
        else return 0;
    }
}
