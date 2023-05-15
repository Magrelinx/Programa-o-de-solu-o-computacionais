package pratica1_scanner;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("De a temperatura em celsius: ");
		celsius = n.nextDouble();

		fahrenheit = (celsius * 1.8) + 32;

		System.out.printf("A temperatura em fahrenheit é: %.1f f. ", fahrenheit);

		n.close();

	}

}
