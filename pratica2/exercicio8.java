package pratica2;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do produto: ");
		int codigo = sc.nextInt();

		if (codigo == 1) {
			System.out.println("Sapato: R$ 99,99");
		} else if (codigo == 2) {
			System.out.println("Bolsa: R$ 103,89");
		} else if (codigo == 3) {
			System.out.println("Camisa: R$ 49,98");
		} else if (codigo == 4) {
			System.out.println("Calça: R$ 89,72");
		} else if (codigo == 5) {
			System.out.println("Blusa: R$ 97,35");
		} else {
			System.out.println("Código de produto inválido.");
		}

		sc.close();
	}

}
