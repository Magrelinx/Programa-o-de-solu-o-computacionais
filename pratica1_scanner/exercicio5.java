package pratica1_scanner;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
//Area de um losango.
		Scanner n = new Scanner(System.in);

		double diagonalMaior, diagonalMenor, area;

		System.out.println("Digite a diagonal maior: ");
		diagonalMaior = n.nextDouble();

		System.out.println("Digite a diagonal menor: ");
		diagonalMenor = n.nextDouble();

		area = (diagonalMaior * diagonalMenor) / 2;

		System.out.printf("A area desse losango é: %.2f m2.", area);

		n.close();

	}

}
