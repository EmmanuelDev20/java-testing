package marzo_6.ESTUDIANTEPASO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstudiantePaso {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Por favor ingrese su nota");
    Integer nota = Integer.parseInt(in.readLine());

    if(nota >= 70) {
      System.out.println("Felicidades, has aprobado");
    }
  }
}
