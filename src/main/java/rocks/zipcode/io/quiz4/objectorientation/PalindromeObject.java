package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String string;

    public PalindromeObject(String input) {
        this.string = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(string);
    }

    public Boolean isPalindrome(){
        return PalindromeEvaluator.isPalindrome(string);
    }

    public String reverseString(){
        return PalindromeEvaluator.reverseString(string);
    }
}
