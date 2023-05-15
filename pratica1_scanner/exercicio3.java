package pratica1_scanner;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		double cotacao_dolar, valorDolar, valorReal;

		System.out.println("Digite a cotação do dolar em reais hoje: ");
		cotacao_dolar = n.nextDouble();

		System.out.println("Digite a quantidade de dolar que você possui: ");
		valorDolar = n.nextDouble();

		valorReal = cotacao_dolar * valorDolar;

		System.out.printf("O valor em reais que você possui é de: %.2f Reais%n", valorReal);

		n.close();
	}

}
