package com.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final int totalLetters = 26;

  public static void main(String[] args) {
    System.out.println("Vamos encontrar o número de anagramas? ");
    System.out.print("Digite uma palavra: ");

    Scanner scan = new Scanner(System.in);
    String word = scan.next();

    System.out.println("A palavra " + word + " tem " + countPairs(word) + " anagramas.");
  }

  private static boolean isAnagram(String str1, String str2) {
    int[] countA = new int[totalLetters];
    int[] countB = new int[totalLetters];

    for (char letter : str1.toCharArray()) {
      countA[letter - 'a']++;
    }

    for (char letter : str2.toCharArray()) {
      countB[letter - 'a']++;
    }

    for (int i = 0; i < totalLetters; i++) {
      if (countA[i] != countB[i]) {
        return false;
      }
    }
    return true;
  }

  private static int countPairs(String text) {
    int count = 0;

    List<String> subsets = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      for (int j = 1; j <= text.length() - i; j++) {
        subsets.add(text.substring(i, i + j));
      }
    }

    for (int i = 0; i < subsets.size(); i++) {
      for (int j = i + 1; j < subsets.size(); j++) {
        String s1 = subsets.get(i);
        String s2 = subsets.get(j);
        if (i != j &&
                s1.length() == s2.length() &&
                isAnagram(s1, s2)) {
          count++;
        }
      }
    }
    return count;
  }
}