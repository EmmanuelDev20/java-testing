package marzo_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Un veterinario atiende todos los sábados por la mañana a las mascotas que han solicitado cita.
// Haga un sistema que le pida al veterinario la cantidad de mascotas que pidieron cita,
// y que imprima al final del proceso cuántos fueron gatos y cuántos fueron perros.

public class Veterinario {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int gatos = 0;
    int perros = 0;

    System.out.print("Ingrese la cantidad de mascotas que pidieron cita: ");
    int mascotas = Integer.parseInt(in.readLine());
    
    for (int i = 1; i <= mascotas; i++) {
      System.out.print("Ingrese el tipo de mascota (gato o perro): ");
      String tipo = in.readLine();
      if (tipo.equals("gato")) {
        gatos++;
      } else if (tipo.equals("perro")) {
        perros++;
      }
    }

    System.out.println("Cantidad de gatos: " + gatos);
    System.out.println("Cantidad de perros: " + perros);
  }
}
