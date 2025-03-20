package VOTACION;

import java.io.*;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Votacion {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int edad = 0;

    System.out.println("Ingrese la edad");
    edad = Integer.parseInt(in.readLine());

    if(edad >= 18) {
      System.out.println("La persona puede votar porque su edad es: " + edad );
    }

  }
}