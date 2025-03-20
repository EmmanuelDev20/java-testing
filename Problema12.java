import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema12 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ingrese el precio original del tiquete a África:");
    int precioOriginal = Integer.parseInt(in.readLine());

    double porcentajePromocion = 15;
    double precioFinal = 0;
    double montoDescuento = 0;

    montoDescuento = precioOriginal * (porcentajePromocion / 100);
    precioFinal = precioOriginal - montoDescuento;
    System.out.println("El costo del tiquete es de: " + precioFinal);
  } 
}

// Una línea aérea pone en promoción los viajes a África. La promoción indica que el costo
// del tiquete tendrá una rebaja del 15 %. Imprima el costo real del tiquete si el programa
// recibe el precio original del mismo