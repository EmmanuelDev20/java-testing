package abril_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Libreria {
  public static void main(String args[]) throws IOException {
    PrintStream out = System.out;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    out.println("Digite el tipo de cliente (1, 2, 3): ");
    int categoriaCliente = Integer.parseInt(in.readLine());
    double tasaDscto = porcentajeDscto(categoriaCliente);
    
    out.println("Digite la cantidad de ejemplares: ");
    int cantidadEjemplares = Integer.parseInt(in.readLine());
    
    out.println("Digite el precio del libro: ");
    double precioLibro = Double.parseDouble(in.readLine());
    
    double montoBruto = calcularTotal(cantidadEjemplares, precioLibro);
    double montoDescuento = calcularDescuento(montoBruto, tasaDscto);
    double montoNeto = calcularNeto(montoBruto, montoDescuento);
    
    out.println("El monto bruto es: " + montoBruto);
    out.println("El monto de descuento es: " + montoDescuento);
    out.println("El monto neto a pagar es: " + montoNeto);
  }

  static double calcularTotal(int cantidadEjemplares, double precioLibro) {
    return cantidadEjemplares * precioLibro;
  }

  static double calcularDescuento(double montoBruto, double porcentajeDescuento) {
    return montoBruto * porcentajeDescuento;
  }

  static double calcularNeto(double totalPagar, double montoDescuento) {
    return totalPagar - montoDescuento;
  }

  static double porcentajeDscto(int tipoCliente) {
    double porcDscto = 0;
    switch (tipoCliente) {
      case 1:
        porcDscto = 0.20;
        break;
      case 2:
        porcDscto = 0.10;
        break;
      case 3:
        porcDscto = 0.05;
        break;
      default:
        porcDscto = 0;
        break;
    }
    return porcDscto;
  }
}