package abril_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class NumeroMayor {
  public static void main(String args[]) throws IOException {
    PrintStream out = System.out;
    int major = getMajorNumber();
    out.println("El número mayor es: " + major);
  }

  public static Integer getMajorNumber()throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int biggerNumber = 0;
    int secondNumber = 0;

    System.out.println("Digite el primer número");
    int numeroUno = Integer.parseInt(in.readLine());
    System.out.println("Digite el segundo número");
    int numeroDos = Integer.parseInt(in.readLine());
    System.out.println("Digite el tercer número");
    int numeroTres = Integer.parseInt(in.readLine()); 

    if (numeroUno > numeroDos) {
      biggerNumber = numeroUno;
      secondNumber = numeroDos;
    } else {
      biggerNumber = numeroDos;
      secondNumber = numeroUno;
    }
    
    if (numeroTres > biggerNumber) {
      secondNumber = biggerNumber;
      biggerNumber = numeroTres;
    } else if (numeroTres > secondNumber) {
      secondNumber = numeroTres;
    }
    return biggerNumber;
  }
}
