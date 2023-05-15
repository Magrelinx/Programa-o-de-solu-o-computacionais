package pratica9;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite o número a ser pesquisado: ");
        int num = sc.nextInt();

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;
        int comparacoes = 0;
        boolean achou = false;

        while (inicio <= fim && !achou) {
            meio = (inicio + fim) / 2;
            comparacoes++;

            if (vetor[meio] == num) {
                achou = true;
            } else if (vetor[meio] < num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (achou) {
            System.out.println("Número encontrado na posição " + meio + " com " + comparacoes + " comparações.");
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
