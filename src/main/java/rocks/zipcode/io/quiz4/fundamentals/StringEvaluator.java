package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substrings = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));

            }
        }
        return substrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> strings1 = new TreeSet<>(Arrays.asList(getAllSubstrings(string1)));
        Set<String> strings2 = new TreeSet<>(Arrays.asList(getAllSubstrings(string2)));
        ArrayList<String> result = new ArrayList<>();
        for (String string: strings1) {
            if(strings2.contains(string)) result.add(string);
        }
        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String largest = commonSubstrings[0];
        for (int i = 0; i < commonSubstrings.length; i++) {
            if (commonSubstrings[i].length() > largest.length()) largest = commonSubstrings[i];
        }
        return largest;
    }
}
