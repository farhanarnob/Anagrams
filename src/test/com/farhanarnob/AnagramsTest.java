package test.com.farhanarnob;

import main.com.farhanarnob.Anagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramsTest {

    @Test
    void testIfTwoWordsNullInAnagrams() {
        String firstString = null;
        String secondString = null;

        Assertions.assertFalse(Anagrams.anagrams(firstString,secondString),
                firstString + " & " + secondString + " are null, so the result must be false.");
    }

    @Test
    void testIfTwoWordsNotAnagrams() {
        String firstString = "Hajmola";
        String secondString = "Hajmi";

        Assertions.assertFalse(Anagrams.anagrams(firstString,secondString),
                firstString + " & " + secondString + " must not be anagrams");
    }

    @Test
    void testIfTwoWordsAnagrams() {
        String firstString = "Astronomer";
        String secondString = "Moon starer";

        Assertions.assertTrue(Anagrams.anagrams(firstString,secondString),
                firstString + " & " + secondString + " must be anagrams");
    }
}