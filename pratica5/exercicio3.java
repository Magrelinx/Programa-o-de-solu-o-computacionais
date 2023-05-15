package pratica5;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

    
        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

       
        if (numero < 0) {
            System.out.println("Número inválido! O número deve ser positivo.");
        } else {
            int fatorial = 1;
  
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }

       
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
