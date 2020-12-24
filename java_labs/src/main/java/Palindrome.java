public class Palindrome {

    public static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input).reverse();
        return sb.toString().equals(input);
    }
}
