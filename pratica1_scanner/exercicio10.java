package pratica1_scanner;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, comprimento, area, volume;
		final double PI = 3.14159265359;

		System.out.print("Informe o valor do raio da esfera: ");
		raio = sc.nextDouble();

		comprimento = 2 * PI * raio;
		System.out.println("Comprimento da esfera: " + comprimento);

		area = PI * raio * raio;
		System.out.println("Área da esfera: " + area);

		volume = (3.0 / 4.0) * PI * Math.pow(raio, 3);
		System.out.println("Volume da esfera: " + volume);

		sc.close();
	}
}