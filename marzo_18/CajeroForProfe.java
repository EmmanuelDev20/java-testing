import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CajeroForProfe {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    double precio = 0;
    double precioFinal = 0;
    int cantProd=0;
    String nombreProducto = "";
    int cantidad = 0;
    
    System.out.println("Digite la cantidad de productos que va a comprar");
    cantProd = Integer.parseInt(in.readLine());
    
    System.out.println("-------- DETALLE DE LA COMPRA-----");
    System.out.println("|Nombre producto  | Cantidad | Precio |");

    for(int contProd=0;contProd < cantProd;contProd++) {
      System.out.println("Digite el nombre del producto");
      nombreProducto = in.readLine();
      System.out.println("Digite la cantidad del produco");
      cantidad = Integer.parseInt (in.readLine());
      System.out.println("Digite el precio del producto");
      precio = Double.parseDouble(in.readLine());
      precioFinal += precio * cantidad;
    }

    System.out.println("-------- FIN DE LÍNEA DE PRODUCTOS");
    System.out.println("El monto total de la factura es " + precioFinal);
  }
}
