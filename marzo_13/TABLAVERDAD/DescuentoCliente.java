package marzo_13.TABLAVERDAD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescuentoCliente {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int user1 = 7; 
    int user2 = 4;
    int user3 = 2;
    double total = 11000;
    
    System.out.println("¿Cuál es el ID del usuario? \n 1. user1. \n 2. user2. \n 3. user3 \n");
    int userSelected = Integer.parseInt(in.readLine());
    int userTimes = 0;

    switch (userSelected) {
      case 1:
        userTimes = user1;
        break;
      case 2:
        userTimes = user2;
        break;
      case 3:
        userTimes = user3;
        break;
      default:
        System.out.println("ID de usuario no válido.");
        return;
    }

    if(userTimes > 6 && total > 10000) {
      total = total * 1.35;
      System.out.println("El total con descuento del 35% es: " + total);
      return;
    }

    System.out.println("El total es: " + total);
  }
}