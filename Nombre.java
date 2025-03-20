import java.io.*;
// import java.util.Scanner;

// public class Nombre {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
    
//     System.out.print("Ingresa el nombre: ");
//     String name = scanner.nextLine();
    
//     System.out.println("El nombre del usuario es: " + name);
    
//     scanner.close();
//   }
// }

public class Nombre {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String name;
    String school;

    System.out.println("Digite su nombre");
    name = in.readLine();
    
    System.out.println("Digite su school");
    school = in.readLine();

    System.out.println("El nombre del usuario es " + name + " y estudió en la " + school);
  }
}