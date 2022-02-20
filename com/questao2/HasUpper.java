package com.questao2;

public class HasUpper {
  static boolean validate(String password) {
    String[] letters = password.split("");
    boolean hasUpper = false;

    for (String letter : letters) {
      if (!HasSpecial.validate(letter) && !HasNumber.validate(letter)) {
        hasUpper = letter.toUpperCase().equals(letter);
        if (hasUpper) {
          break;
        }
      }
    }
    return hasUpper;
  }
}
