package pratica5;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorFeminino = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe a idade da " + i + "ª pessoa: ");
			int idade = sc.nextInt();
			System.out.print("Informe o sexo da " + i + "ª pessoa (M/F): ");
			char sexo = sc.next().charAt(0);

			if (sexo == 'F' && idade >= 20 && idade <= 40) {
				contadorFeminino++;
			}
		}

		System.out.println("Existem " + contadorFeminino + " pessoas do sexo feminino entre 20 e 40 anos.");
	}
}
