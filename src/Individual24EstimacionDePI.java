/*
Ejercicio individual 24 - Estimacion de la constante PI
Alumno: Erick Diaz Guerra
 */
import java.util.Scanner;

public class Individual24EstimacionDePI {

   public static void main(String[] args) {

      Scanner asignar = new Scanner(System.in);

      String nTerminos;
      final double PI = Math.PI;

      System.out.println("############################## ##############################");
      System.out.println("Ingrese la cantidad de terminos para estimar el valor de [pi]:");
      nTerminos = asignar.nextLine();
      while (!esEntero(nTerminos)) {
         System.out.println("Dato no valido, ingrese correctamente la cantidad de terminos:");
         nTerminos = asignar.nextLine();
      }

      int n = Integer.parseInt(nTerminos);
      double suma = 0;
      double pi;
      for (int i = 0; i < n; i++) {
         suma = suma + (Math.pow(-1, i + 2) / (2*i + 1));
      }
      pi = 4 * suma;
      System.out.println("------------------------------ ------------------------------");
      System.out.println("i = "+n);
      System.out.println("     pi = ["+pi+"]");
      System.out.println("     PI = ["+PI+"]");
      System.out.println("|PI-pi| = ["+Math.abs(PI - pi)+"]");
      System.out.print("------------------------------ ------------------------------");

      /*
      // Bloque alternativo para ver los resultados en todas las iteraciones.
      // Para activarlo se debe descomentar este y comentar el anterior.
      int n = Integer.parseInt(nTerminos);
      double suma = 0;
      double pi;
      System.out.println("------------------------------ ------------------------------");
      for (int i = 0; i < n; i++) {
         suma = suma + (Math.pow(-1, i + 2) / (2*i + 1));
         pi = 4 * suma;
         System.out.println("i["+i+"]");
         System.out.println("     pi = ["+pi+"]");
         System.out.println("     PI = ["+PI+"]");
         System.out.println("|PI-pi| = ["+Math.abs(PI - pi)+"]");
         System.out.println("------------------------------ ------------------------------");
      }
      */

   }

   public static boolean esEntero(String numero) {
      int num;
      try {
         num = Integer.parseInt(numero);
         return true;
      } catch (NumberFormatException ex) {
         return false;
      }
   }

}