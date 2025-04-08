import java.io.*;

public class PromedioNotasPorEstudiantes {
  public static void main(String args[]) throws IOException{
    BufferedReader in;
    in = new BufferedReader (new InputStreamReader (System.in));
    String nombreESt = "";
    int cantNotas = 0;
    int nota = 0;
    int sumatoria = 0;
    double promedio = 0;
    int cantEstudiantes = 0;


    System.out.println("Digite la cantidad de estudiantes");
    cantEstudiantes = Integer.parseInt(in.readLine());

    for(int j = 1; j <= cantEstudiantes; j++){
      System.out.println("Digite el nombre del estudiante " + j);
      nombreESt = in.readLine();
      System.out.println("Digite la cantidad de notas");
      cantNotas = Integer.parseInt(in.readLine());

      for (int i = 1; i <= cantNotas; i++){
        System.out.println("Digite la nota " + i);
        nota = Integer.parseInt(in.readLine());
        sumatoria = sumatoria + nota;
      }
      promedio = (double) sumatoria / cantNotas;
      System.out.println("El promedio de " + nombreESt + " es: " + promedio);
      if (promedio >= 3.0){
        System.out.println("El estudiante " + nombreESt + " ha aprobado");
      } else {
        System.out.println("El estudiante " + nombreESt + " ha reprobado");
      }
    }
    // System.out.println("Digite el nombre del estudiante");
    // nombreESt = in.readLine();
    // System.out.println("Digite la cantidad de notas");
    // cantNotas = Integer.parseInt(in.readLine());

    // for (int i = 1; i <= cantNotas; i++){
    //   System.out.println("Digite la nota " + i);
    //   nota = Integer.parseInt(in.readLine());
    //   sumatoria = sumatoria + nota;
    // }
    // promedio = (double) sumatoria / cantNotas;
    // System.out.println("El promedio de " + nombreESt + " es: " + promedio);
    // if (promedio >= 3.0){
    //   System.out.println("El estudiante " + nombreESt + " ha aprobado");
    // } else {
    //   System.out.println("El estudiante " + nombreESt + " ha reprobado");
    // }
  }
}