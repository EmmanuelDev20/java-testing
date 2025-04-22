import java.io.*;

/*
    Las rutinas tienen que estar fuera del main
    
*/;
public class CalculadoraMenu {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintStream out = System.out;
    int suma = 0;
    int resta = 0;
    int division = 0;
    int multiplicacion = 0;
    int a = 0;
    int b = 0;
    int opcion = 0;
    out.println("Digite el valor del primer número> ");
    a = Integer.parseInt(in.readLine());
    out.println("Digite el valor del segundo número> ");
    b = Integer.parseInt(in.readLine());
    do {
      out.println("1. Sumar");
      out.println("2. Restar");
      out.println("3. Dividir");
      out.println("4. Multiplicar");
      out.println("5. Salir");
      out.println("Digite la opción");
      opcion = Integer.parseInt(in.readLine());
      switch (opcion) {
        case 1:
          suma = a + b;
          out.println("El resultado de la suma es " + suma);
          break;
        case 2:
          resta = a - b;
          out.println("El resultado de la resta es " + resta);
          break;
        case 3:
          if (b != 0) {
            division = a / b;
            out.println("El resultado de la division es " + division);
          } else {
            out.println("Error: División por cero no permitida.");
          }
          break;
        case 4:
          multiplicacion = a * b;
          out.println("El resultado de la multiplicacion es " + multiplicacion);
          break;
        case 5:
          out.println("Chao !!");
          break;
        default:
          out.println("Opción no válida. Intente de nuevo.");
      }
    } while (opcion != 5);
  }
}
