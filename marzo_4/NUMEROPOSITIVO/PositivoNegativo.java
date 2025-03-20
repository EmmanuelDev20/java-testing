import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class PositivoNegativo {
  public static void main(String[] args) throws IOException {
    // String str = String.format("Hola, %s! Como estas %s? %s %s", "Sasha", "En el trabajo", "asdfp", "japsdf");
    // // System.out.println(str);
    // // Hola, Sasha! Como estas En el trabajo?

    // double precio = 45.6789;
    // System.out.printf("El precio es: %.2f%n", precio);
    // El precio es: 45.68

    String mensaje = MessageFormat.format("Hola {0}, tienes {1} años.", "Juan", 25);
    System.out.println(mensaje);
    // Hola Juan, tienes 25 años.

    // // // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // // // int number = 0;
    // // // String msg = "";

    // // // System.out.println("Ingrese el número");
    // // // number = Integer.parseInt(in.readLine());

    // // // if(number > 0) {
    // // //   msg = "El numero es positivo";
    // // // } else {
    // // //   msg = "El numero es negativo";
    // // // }

    // // // System.out.println(msg);
  }
}