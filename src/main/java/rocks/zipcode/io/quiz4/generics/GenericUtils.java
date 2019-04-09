package rocks.zipcode.io.quiz4.generics;


import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
//    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
//        Set<Set<T>> power = Sets.powerSet(originalSet);
//        ArrayList<Set<T>> powerlist = new ArrayList<>(power);
//        Set<T> reverse = new LinkedHashSet<>();
//        ArrayList<T> originalList = new ArrayList<>(originalSet);
//        for (int i = originalList.size() - 1; i >= 0; i--)  {
//            reverse.add(originalList.get(i));
//        }
//        Set<Set<T>> reversePower = Sets.powerSet(reverse);
//        ArrayList<Set<T>> reversePowerlist = new ArrayList<>(reversePower);
//        Set<Set<T>> result = new LinkedHashSet<>();
//        result.add(originalSet);
//        for (Set subset: powerlist) {
//            if (subset.size() != originalSet.size() && subset.size() != 0){
//                result.add(subset);
//            }
//        }
//        for (Set subset: reversePowerlist) {
//            if (subset.size() != originalSet.size() && subset.size() != 0){
//                result.add(subset);
//            }
//        }
//        result.add(new LinkedHashSet<>());
//        return result;
//    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Iterator<Set<T>> power = Sets.powerSet(originalSet).iterator();
        ArrayList<List<T>> powerConverted = new ArrayList<>();
        power.forEachRemaining(set -> powerConverted.add((new ArrayList(set))));
        Set<List<T>> result = new LinkedHashSet<>();
        powerConverted.iterator().forEachRemaining(list -> result.addAll(Collections2.permutations(list)));
        Collection<List<T>> extraPermutations = extraPermutations(originalSet);
        result.removeAll(extraPermutations);
        ArrayList<List<T>> resultList = new ArrayList<>(result);
        resultList.sort(new ListComparator());
        return resultList;
    }

    private static <T extends Comparable> Collection<List<T>> extraPermutations(Set<T> originalSet) {
        ArrayList<List<T>> extraPermutations = new ArrayList<>(Collections2.permutations(originalSet));
        extraPermutations.remove(new ArrayList<>(originalSet));
        return extraPermutations;
    }


    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

