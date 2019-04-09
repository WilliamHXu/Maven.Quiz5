package rocks.zipcode.io.quiz4.fundamentals;


import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palindromes = new ArrayList<>();
        for (String eval: substrings) {
            if (isPalindrome(eval))  palindromes.add(eval);
        }
        return palindromes.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += string.charAt(string.length() - i - 1);
        }
        return result;
    }
}
