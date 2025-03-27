// Hacer un programa en Java que le solicit al usuario el nombre de cada provincia de
// Costa Rica, y lo imprima en pantalla con la frase : "El nombre de la provincia es " + nombreProvincia.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Provincia {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 1; i <= 7; i++) {
      System.out.println("Ingrese el nombre de la provincia " + i + ": ");
      String nombreProvincia = in.readLine();
      System.out.println("El nombre de la provincia " + i + " es " + nombreProvincia);
    }
  }
}