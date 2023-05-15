package pratica1_scanner;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
//salario com aumento de 25%
		Scanner n = new Scanner(System.in);

		double salario, novoSalario, aumento;

		System.out.println("Informe seu salário: ");
		salario = n.nextDouble();

		aumento = salario * 0.25;

		novoSalario = salario + aumento;

		System.out.printf("Com o aumento de 25 porcento, o seu salario foi de R$ %.2f para R$ %.2f", salario,
				novoSalario);

		n.close();
		
	}

}
