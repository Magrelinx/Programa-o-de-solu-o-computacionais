package pratica1_scanner;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double cateto1, cateto2, hipotenusa;

		System.out.print("Digite o valor do primeiro cateto: ");
		cateto1 = n.nextDouble();

		System.out.print("Digite o valor do segundo cateto: ");
		cateto2 = n.nextDouble();

		hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

		System.out.println("O valor da hipotenusa é: " + hipotenusa);
		n.close();
	}
}
