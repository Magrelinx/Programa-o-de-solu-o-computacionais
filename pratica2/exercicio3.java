package pratica2;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = n.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double nota2 = n.nextDouble();
		
		System.out.print("Digite a terceira nota do aluno: ");
		double nota3 = n.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media < 3) {
			System.out.println("Reprovado com média " + media);
		} else if (media < 7) {
			System.out.println("Exame com média " + media);
		} else {
			System.out.println("Aprovado com média " + media);
		}
	}
}
