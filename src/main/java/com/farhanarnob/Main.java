package com.farhanarnob;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word below (press enter to exit)");
        String firstWord, secondWord;

        while (Validator.isValidString(firstWord = scanner.nextLine())) {
            System.out.print("Second word:");
            if (Validator.isValidString(secondWord = scanner.nextLine())) {
                if (Anagrams.isAnagrams(firstWord, secondWord))
                    System.out.println("\"" + firstWord + "\" & \"" + secondWord + "\" are anagrams");
                else System.out.println("\"" + firstWord + "\" & \"" + secondWord + "\" are not anagrams");
            } else System.out.println("second word is invalid");
            System.out.println("Enter first word below (press enter to exit)");
        }
    }


}
