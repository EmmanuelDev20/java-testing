package abril_8;

import java.io.*;

public class RepasoArreglos {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintStream out = System.out;

    int[] notas;
    String[] nombres;

    notas = new int[5];
    nombres = new String[5];

    for (int i = 0; i < notas.length; i++) {
      // out.print("Ingrese la nota " + (i + 1) + ": ");
      // notas[i] = Integer.parseInt(in.readLine());
      out.println(notas[i]);
    }

    for(int i = 0; i < nombres.length; i++) {
      // out.print("Ingrese el nombre " + (i + 1) + ": ");
      // nombres[i] = in.readLine();
      out.println(nombres[i]);
    }

    out.println("Digite el nombre del estudiante");
    String nombre = in.readLine();
    nombres[0] = nombre;
    out.println("Digite la nota del estudiante");
    int nota = Integer.parseInt(in.readLine());
  }
}