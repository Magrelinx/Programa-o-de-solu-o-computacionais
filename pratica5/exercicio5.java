package pratica5;

import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        for (int numero = 1; numero != 0; ) {
            System.out.print("Informe um número inteiro (ou digite 0 para sair): ");
            numero = sc.nextInt();
            
            if (numero != 0) {
                if (numero > maior) {
                    maior = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        
        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número foi informado.");
        } else {
            System.out.println("O maior número informado é: " + maior);
            System.out.println("O menor número informado é: " + menor);
        }
    }
}
