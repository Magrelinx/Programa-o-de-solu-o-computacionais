package pratica8;

import java.util.Scanner;

public class exercicio1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int dividendo, divisor, resultado;
      
      System.out.println("Digite o dividendo:");
      dividendo = input.nextInt();
      
      System.out.println("Digite o divisor:");
      divisor = input.nextInt();
      
      if (divisor != 0) {
         resultado = dividendo / divisor;
         System.out.println("Resultado da divisão: " + resultado);
      } else {
         System.out.println("Erro: Divisão por zero!");
      }
   }
}
