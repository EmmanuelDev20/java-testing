import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoPromedio {
  public static void main(String args[])throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double total = 0;
    
    System.out.println("Por favor ingrese su nombre");
    String nombre = in.readLine();

    System.out.println("Ahora ingrese su primer nota");
    double nota1 = Double.parseDouble(in.readLine());

    System.out.println("Ahora ingrese su segunda nota");
    double nota2 = Double.parseDouble(in.readLine());

    System.out.println("Ahora ingrese su tercera nota");
    double nota3 = Double.parseDouble(in.readLine());

    total = (nota1 + nota2 + nota3) / 3;
    System.out.println("El resultado es: " + total);
  }
}