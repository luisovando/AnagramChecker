import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {
    @Test
    public void testInputsAreNull() {
        assertFalse(AnagramChecker.areAnagrams(null, null));
        assertFalse(AnagramChecker.areAnagrams(null, "abc"));
        assertFalse(AnagramChecker.areAnagrams("abc", null));
    }

    @Test
    public void testInputsAreEmpty() {
        assertFalse(AnagramChecker.areAnagrams("", ""));
        assertFalse(AnagramChecker.areAnagrams("", "abc"));
        assertFalse(AnagramChecker.areAnagrams("abc", ""));
    }
}
