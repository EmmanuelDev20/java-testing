import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaVerdad {
  public static void main(String[] args) {
    System.out.println("\nTabla de verdad para AND:");
    System.out.println("P\tQ\tP AND Q");
    for (boolean p : new boolean[] { true, false }) {
      for (boolean q : new boolean[] { true, false }) {
        System.out.println(p + "\t" + q + "\t" + (p && q));
      }
    }

    System.out.println("\nTabla de verdad para OR:");
    System.out.println("P\tQ\tP OR Q");
    for (boolean p : new boolean[] { true, false }) {
      for (boolean q : new boolean[] { true, false }) {
        System.out.println(p + "\t" + q + "\t" + (p || q));
      }
    }

    System.out.println("\nTabla de verdad para NOT:");
    System.out.println("P\tNOT P");
    for (boolean p : new boolean[] { true, false }) {
      System.out.println(p + "\t" + (!p));
    }

    System.out.println("\nTabla de verdad para XOR:");
    System.out.println("P\tQ\tP XOR Q");
    for (boolean p : new boolean[] { true, false }) {
      for (boolean q : new boolean[] { true, false }) {
        System.out.println(p + "\t" + q + "\t" + (p ^ q));
      }
    }
  }
}
