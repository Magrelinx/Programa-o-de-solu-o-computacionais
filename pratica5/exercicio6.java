package pratica5;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		double media = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe a idade da " + i + "ª pessoa: ");
			int idade = sc.nextInt();
			soma += idade;
		}

		media = (double) soma / 10;
		System.out.println("A média das idades informadas é: " + media);
	}
}
