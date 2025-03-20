import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cajero {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    double precioProd1 = 10.5;
    double precioProd2 = 20.5;
    double precioProd3 = 30.5;

    Integer cantProd1 = 10;
    Integer cantProd2 = 12;
    Integer cantProd3 = 22;

    String nombreProd1;
    String nombreProd2;
    String nombreProd3;

    double precioFinal;

    System.out.println("\n\nBienvenido al cajero");

    System.out.println("\nIngresa el nombre del producto 1\n");
    nombreProd1 = in.readLine();

    System.out.println("\nIngresa el nombre del producto 2\n");
    nombreProd2 = in.readLine();
    
    System.out.println("\nIngresa el nombre del producto 3\n");
    nombreProd3 = in.readLine();

    // Retornar el total de la compra
    precioFinal = ((precioProd1 * cantProd1) + (precioProd2 * cantProd2) + (precioProd3 * cantProd3))*1.13;

    System.out.println("\n\nEl precio total de su compra es: " + precioFinal + " por los productos:" + nombreProd1 + ", " + nombreProd2 + ", " + nombreProd3 + "\n\n");

  }
}