package CALCULARPROMEDIOTEMPERATURAS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoPromedioComparativa {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double promedio2024 = 0;
    double promedio2025 = 0;
    
    System.out.println("Ingrese el nombre del país");
    String nombrePais = in.readLine();

    System.out.println("Ingrese promedio del primer trimestre del 2024");
    promedio2024 = Double.parseDouble(in.readLine());

    System.out.println("Ingrese la temperatura del mes de enero del 2025");
    double temperaturaEnero2025 = Double.parseDouble(in.readLine());

    System.out.println("Ingrese la temperatura del mes de febrero del 2025");
    double temperaturaFebrero2025 = Double.parseDouble(in.readLine());

    System.out.println("Ingrese la temperatura del mes de marzo del 2025");
    double temperaturaMarzo2025 = Double.parseDouble(in.readLine());

    promedio2025 = (temperaturaEnero2025 + temperaturaFebrero2025 + temperaturaMarzo2025) / 3;
    if(promedio2024 <= promedio2025) {
      System.out.println("El promedio del 2025 es mayor al del 2024");
    } else {
      System.out.println("El promedio del 2025 es menor al del 2024");
    }
  }
}