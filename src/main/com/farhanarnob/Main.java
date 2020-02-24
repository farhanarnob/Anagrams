package main.com.farhanarnob;

import java.util.Scanner;

import static main.com.farhanarnob.Anagrams.anagrams;
import static main.com.farhanarnob.Validator.isValidString;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word below (press enter to exit)");
        String firstWord, secondWord;

        while (isValidString(firstWord = scanner.nextLine())) {
            if (isValidString(secondWord = scanner.nextLine())) {
                if (anagrams(firstWord, secondWord))
                    System.out.println("\"" + firstWord + "\" & \"" + secondWord + "\" are anagrams");
                else System.out.println("\"" + firstWord + "\" & \"" + secondWord + "\" are not anagrams");
            } else System.out.println("second word is invalid");
        }
    }


}
