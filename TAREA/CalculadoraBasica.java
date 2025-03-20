import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraBasica {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int opcion = 0;
    double resultado = 0;
    double numero1 = 0;
    double numero2 = 0;

    System.out.println("\n\n--- Calculadora Básica ---");
    System.out.println("Seleccione la operación que quieres realizar:");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Salir\n");
    System.out.print("Ingrese su opción: ");

    opcion = Integer.parseInt(in.readLine());

    if (opcion == 5) {
      System.out.println("Saliendo de la calculadora...");
      System.exit(0);
    }

    if (opcion < 1 || opcion > 4) {
      System.out.println("Opción inválida");
      System.exit(0);
    }

    System.out.print("Ingrese el primer número: ");
    numero1 = Double.parseDouble(in.readLine());

    System.out.print("Ingrese el segundo número:");
    numero2 = Double.parseDouble(in.readLine());

    System.out.print("\n====================================\n");

    switch (opcion) {
      case 1:
        resultado = numero1 + numero2;
        System.out.println("Resultado de la suma: " + resultado);
        break;
      case 2:
        resultado = numero1 - numero2;
        System.out.println("Resultado de la resta: " + resultado);
        break;
      case 3:
        resultado = numero1 * numero2;
        System.out.println("Resultado de la multiplicación: " + resultado);
        break;
      case 4:
        if (numero2 != 0) {
          resultado = numero1 / numero2;
          System.out.println("Resultado de la división: " + resultado);
        } else {
          System.out.println("Error: División por cero.");
        }
        break;
    }
    System.out.print("====================================\n\n");
  }
}
