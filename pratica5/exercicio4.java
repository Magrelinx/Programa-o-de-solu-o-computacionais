package pratica5;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, contador = 0;
        double media = 0;
        
        for (int idade = 0; idade >= 0; idade = sc.nextInt()) {
            System.out.print("Informe uma idade (ou digite um número negativo para sair): ");
            
            if (idade >= 0) {
                soma += idade;
                contador++;
            }
        }
        
        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("A média das idades informadas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}
