package main.com.farhanarnob;

import com.sun.istack.internal.NotNull;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Anagrams {
    private static String canonicalize(@NotNull String str) {
        return Stream.of(str
                .trim()
                .toLowerCase()
                .split(""))
                .sorted()
                .collect(Collectors.joining())
                .trim();
    }

    public static boolean anagrams(@NotNull String firstString,
                                   @NotNull String secondString) {
        if (Validator.isValidString(firstString) && Validator.isValidString(secondString))
            return canonicalize(firstString).equals(canonicalize(secondString));
        return false;
    }
}
