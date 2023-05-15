package pratica1_scanner;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double pesoAtual, novoPeso;

		System.out.print("Digite o peso atual da pessoa: ");
		pesoAtual = n.nextDouble();

		novoPeso = pesoAtual * 1.15;
		System.out.printf("Se a pessoa engordar 15%%, o novo peso será: %.2f kg\n", novoPeso);

		novoPeso = pesoAtual * 0.8;
		System.out.printf("Se a pessoa emagrecer 20%%, o novo peso será: %.2f kg", novoPeso);
		
		n.close();
	}
}
