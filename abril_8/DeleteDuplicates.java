package abril_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DeleteDuplicates {
  public static void main(String args[]) throws IOException{
    // Dado un arreglo de Strings con elementos duplicados, crea un nuevo arreglo sin duplicados,
    // preservando el orden original. No uses estructuras como HashSet o ArrayList (solo
    // arreglos).

    // String[] array = {"a", "b", "c", "a", "d", "b", "e"};
    // String[] temp = new String[array.length];

    // int index = 0;
    // for (String str : array) {
    //   boolean found = false;
    //   for (int j = 0; j < index; j++) {
    //     if (temp[j].equals(str)) {
    //       found = true;
    //       break;
    //     }
    //   }
    //   if (!found) {
    //     temp[index++] = str;
    //   }
    // }
    // String[] result = new String[index];
    // System.arraycopy(temp, 0, result, 0, index);

    // for (String str : result) {
    //   System.out.print(str + " ");
    // }



    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintStream out = System.out;

    System.out.println("Digite la cantidad de letras");
    letras = new String[Integer.parseInt(in.readLine())]; // inicializo el arreglo según lo que ingresó el usuario.
    noRepetidos = new String[letras.length];// inicializo el arreglo de no repetidos con el mismo tamaño que el arreglo de letras.
    // solicito cada letra para llenar el arreglo

    for(int i = 0; i < letras.length; i++){
      out.print("Digite la letra");
      String letra = in.readLine();
      letras[i] = letra;//agrego la letra al arreglo
    }

    //variable que me va a indicar en qué posición del nuevo arreglo debo agregar la letra, si no está repetida…
    int indiceAgregar = 0;
    //1. Recorrer el arreglo de letras.
    for(int i = 0; i < letras.length; i++){
      boolean duplicado = false;
      // tengo que empezar a recorrer el arreglo de no duplicados…
      for (int j=0; j < noRepetidos.length; j++) {
        if(letras[i].equals(noRepetidos[j])){
          duplicado = true;
          break; // se usa para salirse del ciclo.
      }

      if(duplicado == false) {
        noRepetidos[indiceAgregar] = letras[i];
        indiceAgregar++;
      }
    }

}
