import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AparezcaMenu {
  public static void main(String args[]) throws IOException{
    BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    // int cantidadVeces = 0;
    // System.out.println("Digite la cantidad de veces que desea que el menú aparezca");
    // cantidadVeces = Integer.parseInt(in.readLine());
    // int value = -1;
    int opcion = 0;
    //ocupamos que luego de mostrar el menú, le pidamos al usuario
    // Seleccione la opción.
    // lo almacenemos en una variable que se llame opción.
    // usemos esa variable en lugar de la variable value, con la condición
    //(opcion !=5)

    do {
      System.out.println("--- Bienvenido al programa ---");
      System.out.println("--- Seleccione una de las opciones siguientes ---");
      System.out.println("1. Sumar.");
      System.out.println("2. Restar.");
      System.out.println("3. Multiplicar.");
      System.out.println("4. Dividir.");
      System.out.println("5. Salir.");
      System.out.println("--- FIN ---");
      opcion = Integer.parseInt(in.readLine());
    } while(opcion != 5);
  }
}