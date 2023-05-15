package pratica1_scanner;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
//Media
		Scanner n = new Scanner(System.in);

		double nota1, nota2, nota3, media;

		System.out.println("Digite as tres notas: ");
		nota1 = n.nextDouble();
		nota2 = n.nextDouble();
		nota3 = n.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("A media aritmetica das notas e: %.2f%n", media);

		n.close();

	}

}
