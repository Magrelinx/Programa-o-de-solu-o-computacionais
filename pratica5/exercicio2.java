package pratica5;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2;

		System.out.print("Digite o primeiro número inteiro: ");
		numero1 = input.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		numero2 = input.nextInt();

		int menor = (numero1 < numero2) ? numero1 : numero2;
		int maior = (numero1 > numero2) ? numero1 : numero2;

		for (int i = menor; i <= maior; i++) {
			System.out.println(i);
		}
	}
}
