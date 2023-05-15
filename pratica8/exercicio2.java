package pratica8;

import java.util.Scanner;

public class exercicio2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int dividendo, divisor, resultado;
      
      System.out.println("Digite o dividendo:");
      dividendo = input.nextInt();
      
      System.out.println("Digite o divisor:");
      divisor = input.nextInt();
      
      try {
         resultado = divisao.dividir(dividendo, divisor);
         System.out.println("Resultado da divisão: " + resultado);
      } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
      }
   }
}
