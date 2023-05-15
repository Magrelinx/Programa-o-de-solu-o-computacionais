package pratica2;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String planeta;
		double v0, t, vt, ht;

		System.out.println("Escolha um planeta para jogar a bola:");
		System.out.println("1 - Mercúrio");
		System.out.println("2 - Vênus");
		System.out.println("3 - Terra");
		System.out.println("4 - Marte");
		System.out.println("5 - Júpiter");
		System.out.println("6 - Saturno");
		System.out.println("7 - Urano");
		System.out.println("8 - Netuno");
		System.out.println("9 - Plutão");

		int opcao = input.nextInt();

		System.out.println("Digite a velocidade inicial da bola (em m/s):");
		v0 = input.nextDouble();

		System.out.println("Digite o instante t (em s):");
		t = input.nextDouble();

		if (opcao == 1) {
			planeta = "Mercúrio";
			vt = v0 - 3.7 * t;
			ht = v0 * t - 1.86 * t * t;
		} else if (opcao == 2) {
			planeta = "Vênus";
			vt = v0 - 8.87 * t;
			ht = v0 * t - 4.61 * t * t;
		} else if (opcao == 3) {
			planeta = "Terra";
			vt = v0 - 9.81 * t;
			ht = v0 * t - 4.9 * t * t;
		} else if (opcao == 4) {
			planeta = "Marte";
			vt = v0 - 3.71 * t;
			ht = v0 * t - 2.44 * t * t;
		} else if (opcao == 5) {
			planeta = "Júpiter";
			vt = v0 - 24.79 * t;
			ht = v0 * t - 61.42 * t * t;
		} else if (opcao == 6) {
			planeta = "Saturno";
			vt = v0 - 10.44 * t;
			ht = v0 * t - 35.04 * t * t;
		} else if (opcao == 7) {
			planeta = "Urano";
			vt = v0 - 8.87 * t;
			ht = v0 * t - 19.18 * t * t;
		} else if (opcao == 8) {
			planeta = "Netuno";
			vt = v0 - 11.15 * t;
			ht = v0 * t - 34.88 * t * t;
		} else if (opcao == 9) {
			planeta = "Plutão";
			vt = v0 - 0.62 * t;
			ht = v0 * t - 0.4 * t * t;
		} else {
			System.out.println("Planeta inválido.");
			return;
		}

		System.out.println("Planeta escolhido: " + planeta);
		System.out.println("Velocidade da bola no instante t: " + vt + " m/s");
		System.out.println("Altura da bola acima do lançamento no instante t:" + ht + "m");
	}
}
