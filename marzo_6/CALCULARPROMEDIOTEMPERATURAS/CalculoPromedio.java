import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoPromedio {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double promedio = 0;
    
    System.out.println("Ingrese el nombre del país");
    String nombrePais = in.readLine();

    System.out.println("Ingrese la temperatura del mes de enero");
    double temperaturaEnero = Double.parseDouble(in.readLine());

    System.out.println("Ingrese la temperatura del mes de febrero");
    double temperaturaFebrero = Double.parseDouble(in.readLine());

    System.out.println("Ingrese la temperatura del mes de marzo");
    double temperaturaMarzo = Double.parseDouble(in.readLine());

    promedio = (temperaturaEnero + temperaturaFebrero + temperaturaMarzo) / 3;
    System.out.println("La temperatura promedio del primer trimestre del año 2025 para el país " + nombrePais + " es de: " + promedio);
  }
}