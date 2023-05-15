package pratica6;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextDouble();
		}

		double menor = numeros[0];
		double maior = numeros[0];
		for (int i = 1; i < 10; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.print("Vetor: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nMenor número: " + menor);
		System.out.println("Maior número: " + maior);

		sc.close();
	}
}
