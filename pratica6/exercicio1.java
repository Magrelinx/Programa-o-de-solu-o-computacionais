package pratica6;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int somaPares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			}
		}

		System.out.print("Vetor: [ ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("]");

		System.out.println("Soma dos números pares: " + somaPares);
	}
}
