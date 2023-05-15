package pratica5;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a base: ");
		int base = sc.nextInt();
		System.out.print("Informe o expoente: ");
		int expoente = sc.nextInt();
		int resultado = 1;

		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}

		System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
	}
}
