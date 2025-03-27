import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdivinarNumero {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Generar un número aleatorio entre 1 y 100
    int numeroAleatorio = (int) (Math.random() * 100) + 1;
    int intentosMaximos = 5; // Limitar el número de intentos
    int intentos = 0;
    boolean adivinado = false;

    System.out.println("¡Bienvenido al juego de adivinar el número!");
    System.out.println("He generado un número aleatorio entre 1 y 100.");
    System.out.println("Tienes " + intentosMaximos + " intentos para adivinarlo.\n");

    while (intentos < intentosMaximos && !adivinado) {
      System.out.print("Intento " + (intentos + 1) + ": Ingresa tu número: ");
      int numeroUsuario = Integer.parseInt(in.readLine());
      intentos++;

      if (numeroUsuario == numeroAleatorio) {
        adivinado = true;
        System.out.println("\n¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
      } else if (numeroUsuario < numeroAleatorio) {
        System.out.println("El número es mayor. Intenta de nuevo.");
      } else {
        System.out.println("El número es menor. Intenta de nuevo.");
      }
    }

    if (!adivinado) {
      System.out.println("\nLo siento, se te acabaron los intentos. El número era: " + numeroAleatorio);
    }
  }
}