package pratica2;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Digite o peso em kg: ");
		double peso = n.nextDouble();
		System.out.print("Digite a altura em metros: ");
		double altura = n.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 20) {
			System.out.println("Abaixo do Peso");
		} else if (imc < 25) {
			System.out.println("Normal");
		} else if (imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");

			n.close();

		}
	}
}
