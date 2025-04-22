package abril_8;

import java.io.IOException;
import java.io.PrintStream;

// Dado un arreglo de cualquier tipo (int, String, etc.), crea un nuevo arreglo que contenga solo
// los elementos en posiciones pares (0, 2, 4, etc.).

public class FilterByPosition {
  public static void main(String args[])throws IOException {
    PrintStream out = System.out;
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    // String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

    int tempNum = 0;

    int[] newNumbers = new int[numbers.length];

    for(int i = 0; i < numbers.length; i += 2) {
      out.println(numbers[i]);
    }

    // for(int i = 0; i < numbers.length; i++) {
    //   if(i % 2 == 0) {
    //     newNumbers[tempNum] = numbers[i];
    //     tempNum++;
    //   }
    // }

    out.println(numbers);
  }
}
