package abril_8;

import java.io.IOException;
import java.io.PrintStream;

public class NumeroMayor {
  // Dado un arreglo de enteros positivos, encuentra el segundo número más grande
  // sin usar
  // métodos de ordenamiento como Arrays.sort().
  public static void main(String args[]) throws IOException {
    PrintStream out = System.out;
    int[] numeros = { 3, 10, 5, 9, 12, 8, 20 };

    int biggerNumber = 0;
    int secondNumber = 0;

    for (int i = 0; i < numeros.length; i++) {
      int tempNum = numeros[i];

      if (tempNum > biggerNumber) {
        secondNumber = biggerNumber;
        biggerNumber = tempNum;
      } else if (tempNum > secondNumber && tempNum < biggerNumber) {
        secondNumber = tempNum;
      }
    }

    out.println(biggerNumber);
    out.println(secondNumber);
  }
}
