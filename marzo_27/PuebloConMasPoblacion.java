import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] provincias = {"San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón"};

    for (String provincia : provincias) {
      System.out.println("Provincia: " + provincia);

      System.out.print("Ingrese la cantidad de ciudades en " + provincia + ": ");
      int cantidadCiudades = Integer.parseInt(in.readLine());

      String ciudadConMasPoblacion = "";
      int maxPoblacion = 0;

      for (int i = 0; i < cantidadCiudades; i++) {
        System.out.print("Ingrese el nombre de la ciudad: ");
        String ciudad = in.readLine();

        System.out.print("Ingrese la población de " + ciudad + ": ");
        int poblacion = Integer.parseInt(in.readLine());

        if (poblacion > maxPoblacion) {
          maxPoblacion = poblacion;
          ciudadConMasPoblacion = ciudad;
        }
      }

      System.out.println("La ciudad con la población más grande en " + provincia + " es: " + ciudadConMasPoblacion);
      System.out.println("Población: " + maxPoblacion);
      System.out.println();
    }

  }
}