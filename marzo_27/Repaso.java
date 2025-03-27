import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso{
  public static void main (String args[]) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


    // se va a crer un menú con las opciones de los tipos de condicional.
    int opcion = 0;

    do{
      System.out.println(" Menú");
      System.out.println("1. Condicional Simple");
      System.out.println("2. Condicional Doble");
      System.out.println("3. Condicional Múltiple");
      System.out.println("4. Salir");
      System.out.println("Digite el número de la opción que desea seleccionar");
      opcion = Integer.parseInt(in.readLine());

      switch (opcion) {
        case 1:
          System.out.println("Condicional Simple seleccionada");
          System.out.println("Digite el número");
          int numero = Integer.parseInt(in.readLine());
          if((numero % 2) == 0){
            System.out.println("El número es par");
          }

          break;
        case 2:
          System.out.println("Condicional Doble seleccionada");
          System.out.println("Digite la nota del estudiante");
          int nota = Integer.parseInt(in.readLine());
          if(nota >= 60){
            System.out.println("El estudiante aprobó");
          }else{
            System.out.println("El estudiante reprobó");
          }
          break;
        case 3:
          System.out.println("Condicional Múltiple seleccionada");
          char estCivil = in.readLine().charAt(0);
          switch (estCivil) {
            case 'S':
              System.out.println("Soltero");
              break;
            case 'C':
              System.out.println("Casado");
              break;
            case 'D':
              System.out.println("Divorciado");
              break;
            case 'V':
              System.out.println("Viudo");
              break;
            default:
              System.out.println("Estado civil no válido");
          }
          break;
        default:
          System.out.println("Opción no válida, por favor intente de nuevo.");
          break;
      }
    }while(opcion !=4);
  }
}