import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

    String nombre = "Ana Bolena";
    int [] edades; // declaración de un arreglo de enteros.
    String [] nombres; // declaración de un arreglo de Strings.

    //al inicializar el valor del arreglo le defino el tamaño.
    nombres = new String[5];
    edades = new int[5];

    // se puede declarar e inicializar un arreglo a la vez.
    String[] paises = new String[5];

    System.out.println("--- ASIGNAR UN VALOR A UN ARREGLO ---");
    
    nombres[0] = "Ana Bolena";
    nombres[1] = "Enrique";
    nombres[2] = "Isabel";
    nombres[3] = "Fernando";
    nombres[4] = "Luis";
    
    System.out.println("--- IMPRESIÓN DE ARREGLOS ---");
    System.out.println(nombres[0]);
    System.out.println(nombres[1]);
    System.out.println(nombres[2]);
    System.out.println(nombres[3]);
    System.out.println(nombres[4]);

    for(int contNombres = 0; contNombres < nombres.length; contNombres++) {
      System.out.println("Imprimiendo el nombre");
      System.out.println(nombres[contNombres]);
    }
  }
}