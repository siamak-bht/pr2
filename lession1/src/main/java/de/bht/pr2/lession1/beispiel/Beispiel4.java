package de.bht.pr2.lession1.beispiel;

public class Beispiel4 {

  // Mehrere catch-Bloecke

  public static void main(String[] args) {
    double division = 0d; // Schon Platz reservieren

    try {
      int zaehler = 100;
      int nenner = 1; // Am Ende erreichen wir Eins
      division = zaehler / nenner;

      int[] array = {1, 2, 3, 4, 5};
      array[5] = 100;
    } catch (ArithmeticException e) {
      System.out.println("!!! Ausnahme:");
      System.out.println(e);
      division = 0; // Default-Wert zuweisen
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("!!! Ausnahme mit einem Array:");
      System.out.println(e);
    }

    System.out.println("Ergebnis: " + division);
  }
}
