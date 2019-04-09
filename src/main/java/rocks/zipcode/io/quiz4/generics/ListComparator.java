package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof List && o2 instanceof List){
            List list1 = (List) o1;
            List list2 = (List) o2;
            if (list1.size() == 0 && list2.size() == 0){
                return 0;
            }
            else if (list1.size() == 0){
                return 1;
            }
            else if (list2.size() == 0) {
                return -1;
            }
            else {
                if (!list1.get(0).equals(list2.get(0))) {
                    return ((Comparable) list1.get(0)).compareTo(((Comparable) list2.get(0)));
                } else {
                    return ((Integer) list2.size()).compareTo(((Integer) list1.size()));
                }
            }
//            if (((List) o1).size() == 0 && ((List) o2).size() == 0){
//                return 0;
//            }
//            else if (((List) o1).size() == 0){
//                return 1;
//            }
//            else if (((List) o2).size() == 0) {
//                return -1;
//            }
//            else {
//                if (((List) o1).get(0).equals(((List) o2).get(0))){
//                    return ((Integer)(((List) o1).size())).compareTo(((List) o2).size());
//                }
//                else {
//                    return ((Comparable)(((List) o1).get(0))).compareTo(((List) o2).get(0));
//                }
//            }
        }
        return 0;
    }
}
