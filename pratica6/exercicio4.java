package pratica6;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = sc.nextDouble();
		}

		System.out.println("Elementos nas posições pares do vetor:");
		for (int i = 0; i < 10; i += 2) {
			System.out.println(numeros[i]);
		}
	}
}
