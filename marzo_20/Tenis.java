package marzo_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// El tenis es un deporte que se juega entre dos jugadores. Los jugadores juegan a tres sets, el que
// gane dos sets. Cada set tiene una cantidad de "games" y lo gana el jugador que más games gane.
// Haga un programa que reciba la cantidad de games que ganó cada jugador, para cada uno de los tres sets del
// partido. Tome en cuenta que si un jugador gana los dos primeros sets, el programa lo debe declarar
// ganador y no pedir la información del tercer set.
// Por ejemplo. Juegan Rafael Nadal y Roger Federer. El sistema debe pedir el nombre de los dos jugadores,
// y, para cada set (hasta un máximo de tres) solicitar: cuántos games ganó Rafael Nadal? cuántos sets ganó
// Roger Federer, y con esa información, determinar quién ganó el set.
// Luego debe hacer los mismo para el segundo y el tercer set.


public class Tenis {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Ingrese el nombre del jugador 1: ");
    String jugador1 = in.readLine();
    System.out.print("Ingrese el nombre del jugador 2: ");
    String jugador2 = in.readLine();

    int gamesJugador1 = 0;
    int gamesJugador2 = 0;
    int setsJugador1 = 0;
    int setsJugador2 = 0;

    for (int i = 1; i <= 3; i++) {
      System.out.print("Ingrese la cantidad de games que ganó " + jugador1 + " en el set " + i + ": ");
      int games = Integer.parseInt(in.readLine());
      gamesJugador1 += games;
      System.out.print("Ingrese la cantidad de games que ganó " + jugador2 + " en el set " + i + ": ");
      games = Integer.parseInt(in.readLine());
      gamesJugador2 += games;

      if (gamesJugador1 > gamesJugador2) {
        setsJugador1++;
      } else {
        setsJugador2++;
      }

      if (setsJugador1 == 2) {
        System.out.println(jugador1 + " ganó el partido");
        break;
      } else if (setsJugador2 == 2) {
        System.out.println(jugador2 + " ganó el partido");
        break;
      }
    }
  }
}
