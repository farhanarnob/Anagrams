package com.farhanarnob;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramsTest {

    @Test
    void testIfTwoWordsNullInAnagrams() {
        String firstString = null;
        String secondString = null;

        Assertions.assertFalse(Anagrams.isAnagrams(null,null),
                firstString + " & " + secondString + " are null, so the result must be false.");
    }

    @Test
    void testIfTwoWordsNotAnagrams() {
        String firstString = "Hajmola";
        String secondString = "Hajmi";

        Assertions.assertFalse(Anagrams.isAnagrams(firstString,secondString),
                firstString + " & " + secondString + " must not be anagrams");
    }

    @Test
    void testIfTwoWordsAnagrams() {
        String firstString = "Astronomer";
        String secondString = "Moon starer";

        Assertions.assertTrue(Anagrams.isAnagrams(firstString,secondString),
                firstString + " & " + secondString + " must be anagrams");
    }
}