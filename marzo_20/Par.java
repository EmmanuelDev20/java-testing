package marzo_20;

// Haga un programa en Java que solicite, para una cantidad dada de números, cuantos son par y cuántos impar.
public class Par {
  public static void main(String args[]) {
    int pares = 0;
    int impares = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print("Ingrese un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    System.out.println("Cantidad de números pares: " + pares);
    System.out.println("Cantidad de números impares: " + impares);
  }
}
