import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CajeroFor {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int cantProd = 0;
    String nombreProducto = "";

    System.out.println("\nDigite la cantidad de productos que va a comprar\n");
    cantProd = Integer.parseInt(in.readLine());

    for(int contProd = 0; contProd < cantProd; contProd++) {
      System.out.println("\nIngresa el nombre del producto " + (contProd + 1) + "\n");
      nombreProducto = in.readLine();
      System.out.println("\nEl nombre del producto digitado fue " + nombreProducto + "\n");
    }
  }
}