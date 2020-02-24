package com.farhanarnob;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.farhanarnob.Validator.isValidString;


public class Anagrams {
    private static String canonicalize(String str) {
        return Stream.of(str
                .trim()
                .toLowerCase()
                .split(""))
                .sorted()
                .collect(Collectors.joining())
                .trim();
    }

    public static boolean isAnagrams(String firstString,
                                     String secondString) {
        if (isValidString(firstString) && isValidString(secondString))
            return canonicalize(firstString).equals(canonicalize(secondString));
        return false;
    }
}
