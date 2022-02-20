package com.questao2;

public class HasSpecial {
  static boolean validate(String password) {
    String[] letters = password.split("");
    String[] specials = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
    boolean hasSpecials = false;

    for (String letter : letters) {
      for (String special : specials) {
        if (letter.equals(special)) {
          hasSpecials = true;
          break;
        }
      }
    }
    return hasSpecials;
  }
}
