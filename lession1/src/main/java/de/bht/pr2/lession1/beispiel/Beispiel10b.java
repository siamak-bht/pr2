package de.bht.pr2.lession1.beispiel;

public class Beispiel10b {

  // Moeglichst spezifischste Ausnahme benutzen

  public static void main(String[] args) {
    try {
      int[] array = {0, 1, 2, 3, 4};
      array[99999] = 99999;
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Uh oh... Falscher Index in... was??");
      System.out.println(e);
    }
  }
}
