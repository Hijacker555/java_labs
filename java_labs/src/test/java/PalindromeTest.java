import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testRegularCase() {
        assertTrue(Palindrome.isPalindrome("aba"));
        assertTrue(Palindrome.isPalindrome("aaa"));
        assertTrue(Palindrome.isPalindrome("BBBCCCBBB"));
    }

    @Test
    public void testNegativeCase() {
        assertFalse(Palindrome.isPalindrome("asdf"));
    }
}