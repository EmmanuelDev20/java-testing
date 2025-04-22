package abril_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CuantaMadera {
  // Una empresa que fabrica juguetes para niños desea calcula cuánta madera
  // necesita para construir juegos de
  // piezas de armar que contengan cubos, esferas y cilindros. Haga un programa
  // que, a partir del número de piezas de
  // cada tipo y las dimensiones de cada tipo de pieza, calcule el volumen total
  // de la madera que se necesita. Suponga
  // que todos los cubos tienen la misma dimensión, todas las esferas son iguales
  // y todos los cilindros también tienen la
  // misma dimensión, además recuerde que:
  public static void main(String args[]) throws IOException {
    PrintStream out = System.out;
    int major = CuantaMadera();
    out.println("El total de madera es: " + major);
    
    double volumenCubos = volumenCubos(2.0, 5);
    double volumenEsferas = volumenEsferas(1.0, 3);
    double volumenCilindros = volumenCilindros(1.0, 2.0, 4);
    double totalVolumen = volumenTotal(volumenCubos, volumenEsferas, volumenCilindros);
    out.println("El volumen total de madera es: " + totalVolumen);
  }

  public static Integer CuantaMadera() throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Digite el primer número");
    int numeroUno = Integer.parseInt(in.readLine());

    return numeroUno;
  }

  public static double volumenCubos(double lado, int cantidad) {
    return Math.pow(lado, 3) * cantidad;
  }
  public static double volumenEsferas(double radio, int cantidad) {
    return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3) * cantidad;
  }
  public static double volumenCilindros(double radio, double altura, int cantidad) {
    return Math.PI * Math.pow(radio, 2) * altura * cantidad;
  }
  public static double volumenTotal(double volumenCubos, double volumenEsferas, double volumenCilindros) {
    return volumenCubos + volumenEsferas + volumenCilindros;
  }
}
