
package u04e07;

import java.util.Scanner;
public class U04E07{
    public static void main(String args[]) {
      Scanner entrada = new Scanner (System.in);
      int num1;
      System.out.print("Ingrese un numero: ");
      num1 = entrada.nextInt();
      if (num1%2==0){
          System.out.print("El numero "+num1+" es par");
          }
          else{
          System.out.print("El numero "+num1+" es impar");
          }
    }
}