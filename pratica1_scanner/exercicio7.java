package pratica1_scanner;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double salarioMinimo, salarioFuncionario, quantidadeSalariosMinimos;

		System.out.print("Informe o valor do salário mínimo: ");
		salarioMinimo = n.nextDouble();

		System.out.print("Informe o valor do salário do funcionário: ");
		salarioFuncionario = n.nextDouble();

		quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

		System.out.printf("O funcionário recebe %.0f Salarios minimos", quantidadeSalariosMinimos);
		
		n.close();
	}

}
