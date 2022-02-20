package com.questao2;

public class HasLower {
  static boolean validate(String password) {
    String[] letters = password.split("");
    boolean hasLower = false;

    for (String letter : letters) {
      if (!HasSpecial.validate(letter) && !HasNumber.validate(letter)) {
        hasLower = letter.toLowerCase().equals(letter);
        if (hasLower) {
          break;
        }
      }
    }
    return hasLower;
  }
}
