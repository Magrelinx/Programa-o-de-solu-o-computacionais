package pratica2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Digite o lado A do triângulo: ");
		double ladoA = n.nextDouble();
		
		System.out.print("Digite o lado B do triângulo: ");
		double ladoB = n.nextDouble();
		
		System.out.print("Digite o lado C do triângulo: ");
		double ladoC = n.nextDouble();

		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Triângulo equilátero");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Triângulo isósceles");
		} else {
			System.out.println("Triângulo escaleno");
		}
	}
}
