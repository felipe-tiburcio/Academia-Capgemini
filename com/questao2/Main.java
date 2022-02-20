package com.questao2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Bem vind@ à melhor rede social dos últimos tempos da última semana!");
    System.out.println("Por favor, digite uma senha contendo pelo menos 6 caracteres, 1 número, 1 caractere especial, 1 letra minúscula e 1 letra maiúscula.");
    System.out.print("Senha: ");

    Scanner scan = new Scanner(System.in);
    String password = scan.next();

    makeValidations(password);
  }

  static boolean makeValidations(String password) {
    boolean isValid = false;

    System.out.println("\nSua senha tem: \n");

    int missingChars = 6 - password.length();
    System.out.println(
            "6 caracteres: " + (HasSize.validate(password)
                    ? "Sim"
                    : "Não, faltam " + missingChars + " caracteres.")
    );
    System.out.println(
            "1 número: " + (HasNumber.validate(password) ? "Sim" : "Não")
    );
    System.out.println(
            "1 caractere especial: " + (HasSpecial.validate(password) ? "Sim" : "Não")
    );
    System.out.println(
            "1 letra minúscula: " + (HasLower.validate(password) ? "Sim" : "Não")
    );
    System.out.println(
            "1 letra maiúscula: " + (HasUpper.validate(password) ? "Sim" : "Não")
    );

    isValid = (
            HasSize.validate(password)
                    && HasNumber.validate(password)
                    && HasSpecial.validate(password)
                    && HasLower.validate(password)
                    && HasUpper.validate(password)
    );

    System.out.println(
            isValid
                    ? "\nA senha escolhida é forte. Passou em todos os testes. Ótima escolha!"
                    : "\nDesculpe, mas sua senha não é forte. Favor criar outra senha corrigindo o(s) campo(s) indicado(s) com 'Não'."
    );

    return isValid;
  }
}

