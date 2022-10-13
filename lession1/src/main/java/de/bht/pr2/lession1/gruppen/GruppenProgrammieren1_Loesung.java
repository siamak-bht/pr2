package de.bht.pr2.lession1.gruppen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GruppenProgrammieren1_Loesung {

  // Wie kann man die Ausnahme ausloesen?
  // Wie behandeln?

  public static void main(String[] args) {
    Scanner tastatur = new Scanner(System.in);
    System.out.println("Schoenen guten Tag!");
    System.out.print("Was ist Ihre Lieblingsnummer heute?");

    try {
      int lieblingsnummer = tastatur.nextInt();
      System.out.println(lieblingsnummer + " ist eine schoene Zahl.");
    } catch (InputMismatchException e) {
      System.out.println("Der Benutzer hat etwas falsches eingetippt.");
      System.out.println(e);
    }

    tastatur.close();
  }
}
