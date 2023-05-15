package pratica1_scanner;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
//Idade em 2050
		Scanner n = new Scanner(System.in);

		int ano_nascimento, ano_atual, idade2050, idade;

		System.out.println("Digite o ano atual: ");
		ano_atual = n.nextInt();

		System.out.println("Digite o ano que voce nasceu: ");
		ano_nascimento = n.nextInt();

		idade = ano_atual - ano_nascimento;

		idade2050 = 2050 - ano_nascimento;

		System.out.printf("Sua idade hoje e : %d%n", idade);

		System.out.printf("Sua idade em 2050 e : %d%n", idade2050);

		n.close();

	}

}
