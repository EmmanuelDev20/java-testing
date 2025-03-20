package marzo_4.RAIZCUADRADA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RaizCuadrada {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int number = 0;
    double raiz = 0;

    System.out.println("Ingrese el número");
    number = Integer.parseInt(in.readLine());

    if(number > 0) {
      raiz = Math.sqrt(number);
      System.out.println(raiz);
    }
  }
}