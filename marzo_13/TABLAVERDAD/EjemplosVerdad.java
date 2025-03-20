import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemplosVerdad {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Ingrese su edad: ");
    int edad = Integer.parseInt(in.readLine());

    System.out.print("¿Vive en Costa Rica? (true/false): ");
    boolean viveEnCostaRica = Boolean.parseBoolean(in.readLine());

    System.out.println("\nEjemplos de expresiones lógicas relacionadas con la edad y el lugar de residencia:");

    // Ejemplo 1: Edad mayor a 17 y vive en Costa Rica
    System.out.println("edad > 17 && viveEnCostaRica");
    System.out.println(edad > 17 && viveEnCostaRica);

    // Ejemplo 2: Edad menor a 18 o no vive en Costa Rica
    System.out.println("edad < 18 || !viveEnCostaRica");
    System.out.println(edad < 18 || !viveEnCostaRica);

    // Ejemplo 3: No es menor de edad (edad >= 18)
    System.out.println("!(edad < 18)");
    System.out.println(!(edad < 18));

    // Ejemplo 4: Edad mayor a 30 o vive en Costa Rica
    System.out.println("edad > 30 || viveEnCostaRica");
    System.out.println(edad > 30 || viveEnCostaRica);


    // boolean invierno = true;
    // boolean verano = false;
    // int temperatura = 5;

    // System.out.println("Ejemplos de expresiones lógicas:");

    // // Ejemplo AND
    // System.out.println("invierno == true && temperatura < 10");
    // System.out.println(invierno == true && temperatura < 10); // true

    // // Ejemplo OR
    // System.out.println("invierno == true || temperatura > 20");
    // System.out.println(invierno == true || temperatura > 20); // true

    // // Ejemplo NOT
    // System.out.println("!verano");
    // System.out.println(!verano); // true

    // // Ejemplo XOR
    // System.out.println("invierno ^ verano");
    // System.out.println(invierno ^ verano); // true
  }
}