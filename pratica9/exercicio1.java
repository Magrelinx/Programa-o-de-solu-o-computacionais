package pratica9;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetor = new int[10];

		System.out.println("Digite 10 números:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		while (true) {
			System.out.println("Digite o número a ser pesquisado (ou -1 para sair):");
			int numero = input.nextInt();
			if (numero == -1) {
				break;
			}

			System.out.println("Digite o tipo de busca (1 - Sequencial, 2 - Sequencial com Sentinela):");
			int tipo = input.nextInt();

			int comparacoes = 0;
			boolean encontrado = false;

			if (tipo == 1) {
				for (int i = 0; i < vetor.length; i++) {
					comparacoes++;
					if (vetor[i] == numero) {
						encontrado = true;
						break;
					}
				}
			} else if (tipo == 2) {

				vetor[vetor.length - 1] = numero;

				int i = 0;
				while (vetor[i] != numero) {
					comparacoes++;
					i++;
				}

				vetor[vetor.length - 1] = 0;

				if (i < vetor.length - 1) {
					encontrado = true;
				}
			} else {
				System.out.println("Tipo de busca inválido!");
				continue;
			}

			if (encontrado) {
				System.out.println("Número encontrado! Comparacoes: " + comparacoes);
			} else {
				System.out.println("Número não encontrado! Comparacoes: " + comparacoes);
			}
		}

		input.close();
	}
}
