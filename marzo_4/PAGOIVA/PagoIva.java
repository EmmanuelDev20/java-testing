package marzo_4.PAGOIVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoIva {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double number = 0;

    System.out.println("Ingrese su consumo mensual de luz en kWh");
    number = Integer.parseInt(in.readLine());

    if(number > 200) {
      number = number * 1.13;
    }
    
    System.out.println("Usted debe pagar " + number );
  }
}