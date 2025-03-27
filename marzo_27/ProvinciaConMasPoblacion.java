import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Pedir al usuario la cantidad de provincias
    System.out.print("Ingrese la cantidad de provincias: ");
    int cantidadProvincias = Integer.parseInt(in.readLine());

    String provinciaConMasPoblacion = "";
    int maxPoblacion = 0;

    // Solicitar datos al usuario
    for (int i = 0; i < cantidadProvincias; i++) {
      System.out.print("Ingrese el nombre de la provincia: ");
      String provincia = in.readLine();

      System.out.print("Ingrese la población de " + provincia + ": ");
      int poblacion = Integer.parseInt(in.readLine());

      if (poblacion > maxPoblacion) {
        maxPoblacion = poblacion;
        provinciaConMasPoblacion = provincia;
      }
    }

    // Imprimir la provincia con la población más grande
    System.out.println("La provincia con la población más grande es: " + provinciaConMasPoblacion);
    System.out.println("Población: " + maxPoblacion);

  }
}