package pratica7;

import java.util.Scanner;

public class exercicio1 {
   public static void main(String[] args) {
      int[][] matriz = new int[5][5];
      Scanner input = new Scanner(System.in);
      
      System.out.println("Digite os elementos da matriz 5x5:");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            matriz[i][j] = input.nextInt();
         }
      }
      
      System.out.println("Matriz informada:");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
      }
   }
}
