import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraVerdad {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("\n\nBienvenido a la calculadora de la verdad\n\n");
    System.out.println("Por favor ingrese la operación que quieres calcular");
    System.out.println("1. AND");
    System.out.println("2. OR");
    System.out.println("3. NOT");
    System.out.println("4. XOR");

    int operacion = 0;
    boolean entradaValida = false;

    while (!entradaValida) {
      try {
        operacion = Integer.parseInt(in.readLine());
        if (operacion >= 1 && operacion <= 4) {
          entradaValida = true;
        } else {
          System.out.println("Error: Por favor, ingrese una opción válida (1-4).");
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Por favor, ingrese un número válido.");
      }
    }

    boolean p = false;
    boolean q = false;

    if (operacion != 3) {
      entradaValida = false;
      while (!entradaValida) {
        System.out.println("Por favor ingrese el valor de verdad de la primera proposición (true o false)");
        try {
          p = Boolean.parseBoolean(in.readLine());
          entradaValida = true;
        } catch (Exception e) {
          System.out.println("Error: Por favor, ingrese un valor de verdad válido (true o false).");
        }
      }

      entradaValida = false;
      while (!entradaValida) {
        System.out.println("Por favor ingrese el valor de verdad de la segunda proposición (true o false)");
        try {
          q = Boolean.parseBoolean(in.readLine());
          entradaValida = true;
        } catch (Exception e) {
          System.out.println("Error: Por favor, ingrese un valor de verdad válido (true o false).");
        }
      }
    } else {
      entradaValida = false;
      while (!entradaValida) {
        System.out.println("Por favor ingrese el valor de verdad de la proposición (true o false)");
        try {
          p = Boolean.parseBoolean(in.readLine());
          entradaValida = true;
        } catch (Exception e) {
          System.out.println("Error: Por favor, ingrese un valor de verdad válido (true o false).");
        }
      }
    }

    boolean resultado = false;
    switch (operacion) {
      case 1:
        resultado = p && q;
        System.out.println("El resultado de " + p + " AND " + q + " es: " + resultado);
        break;
      case 2:
        resultado = p || q;
        System.out.println("El resultado de " + p + " OR " + q + " es: " + resultado);
        break;
      case 3:
        resultado = !p;
        System.out.println("El resultado de NOT " + p + " es: " + resultado);
        break;
      case 4:
        resultado = p ^ q;
        System.out.println("El resultado de " + p + " XOR " + q + " es: " + resultado);
        break;
    }
    // 
  }
}