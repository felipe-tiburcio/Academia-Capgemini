package com.questao2;

public class HasNumber {
  static boolean validate(String password) {
    String[] letters = password.split("");
    String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    boolean hasNumber = false;

    for (String letter : letters) {
      for (String number : numbers) {
        if (letter.equals(number)) {
          hasNumber = true;
        }
      }
    }
    return hasNumber;
  }
}
