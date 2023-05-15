package pratica2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = n.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double nota2 = n.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aluno aprovado com média de:" + media);
		} else {
			System.out.println("Aluno reprovado com média de: " + media);
		}
	}
}