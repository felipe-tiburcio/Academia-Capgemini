package com.questao1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Vamos fazer uma árvore de estrelas!");
    System.out.println("Digite o número de estrelas na base: ");

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    makeTree(n);

    System.out.println("Ho! Ho! Ho! Feliz Natal!");
  }

  static void makeStars(int n) {
    String star = "*";
    String totalStars = "";

    for (int i = 0; i < n; i++) {
      totalStars += star;
    }
    System.out.println(totalStars);
  }


  static void makeSpaces(int n) {
    String space = " ";
    String totalSpaces = "";

    for (int i = 0; i < n; i++) {
      totalSpaces += space;
    }
    System.out.print(totalSpaces);
  }


  static void makeTree(int n) {
    int starsIncrement = 1;

    for (int i = n - 1; i >= 0; i--) {
      makeSpaces(i);
      makeStars(starsIncrement++);
    }
  }
}