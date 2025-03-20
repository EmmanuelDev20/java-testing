import java.io.*;

public class CalculoIva {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

    String nombreProducto;

    double precio, iva, precioTotal, porcentajeIVA;
    
    porcentajeIVA = 13;
    
    System.out.print("Digite el nombre del producto: ");
    
    nombreProducto = in.readLine();
    
    System.out.print("Ingrese el precio del producto y devolvere el precio total con IVA: ");
    
    precio = Integer.parseInt(in.readLine());
    
    iva = Math.abs(precio * (porcentajeIVA / 100));
    
    precioTotal = precio + iva;
    
    System.out.println("El IVA es de " + iva + " colones");
    
    System.out.println("Por lo tanto, el precio total de " + nombreProducto + " es de " + precioTotal + " colones");
  }
}
