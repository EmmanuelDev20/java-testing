import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Problema11 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("¿Cuántas páginas web le contrataron a Gabriel en el mes?");
    int cantidadWebs = Integer.parseInt(in.readLine());

    int precioPorWeb = 50;
    int precioTotal = 0;
    
    precioTotal = cantidadWebs * precioPorWeb;
  
    System.out.println("El total de ingresos de Gabriel es de: " + precioTotal);
  }
}

// Extended version Problema11
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.BufferedReader;

// public class Problema11 {
//   public static void main(String[] args) throws IOException {
//     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
//     int cantidadWebs = 0;
//     boolean entradaValida = false;

//     while (!entradaValida) {
//       System.out.println("¿Cuántas páginas web le contrataron a Gabriel en el mes?");
//       try {
//         cantidadWebs = Integer.parseInt(in.readLine());
//         entradaValida = true;
//       } catch (NumberFormatException e) {
//         System.out.println("Error: Por favor, ingrese un número válido.");
//       }
//     }
    
//     if(cantidadWebs == 0) {
//       System.out.println("No le contrataron ninguna página web a Gabriel.");
//       return;
//     }

//     if(cantidadWebs < 0) {
//       System.out.println("El número de páginas web no puede ser negativo.");
//       return;
//     }

//     int precioPorWeb = 50;
//     int precioTotal = 0;
    
//     precioTotal = cantidadWebs * precioPorWeb;
  
//     System.out.println("El total de ingresos de Gabriel es de: " + precioTotal);
//   }
// }