package pratica3;

import java.util.Scanner;

public class exercicio3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal = 1, totalPessoas = 0;
        int audienciaCanal2 = 0, audienciaCanal4 = 0, audienciaCanal5 = 0, audienciaCanal7 = 0, audienciaCanal12 = 0;

        while (canal != 0) {
            System.out.print("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para encerrar: ");
            canal = input.nextInt();

            if (canal == 0) {
                continue;
            }

            System.out.print("Digite o número de pessoas assistindo o canal: ");
            int pessoasAssistindo = input.nextInt();

           
            totalPessoas += pessoasAssistindo;

            if (canal == 2) {
                audienciaCanal2 += pessoasAssistindo;
            } else if (canal == 4) {
                audienciaCanal4 += pessoasAssistindo;
            } else if (canal == 5) {
                audienciaCanal5 += pessoasAssistindo;
            } else if (canal == 7) {
                audienciaCanal7 += pessoasAssistindo;
            } else if (canal == 12) {
                audienciaCanal12 += pessoasAssistindo;
            } else {
                System.out.println("Canal inválido. Tente novamente.");
                continue;
            }
        }

        System.out.println("Percentual de audiência de cada canal:");
        if (totalPessoas == 0) {
            System.out.println("Nenhum canal foi assistido.");
        } else {
            if (audienciaCanal2 > 0) {
                double percentualCanal2 = audienciaCanal2 * 100.0 / totalPessoas;
                System.out.printf("Canal 2: %.2f%%\n", percentualCanal2);
            }
            if (audienciaCanal4 > 0) {
                double percentualCanal4 = audienciaCanal4 * 100.0 / totalPessoas;
                System.out.printf("Canal 4: %.2f%%\n", percentualCanal4);
            }
            if (audienciaCanal5 > 0) {
                double percentualCanal5 = audienciaCanal5 * 100.0 / totalPessoas;
                System.out.printf("Canal 5: %.2f%%\n", percentualCanal5);
            }
            if (audienciaCanal7 > 0) {
                double percentualCanal7 = audienciaCanal7 * 100.0 / totalPessoas;
                System.out.printf("Canal 7: %.2f%%\n", percentualCanal7);
            }
            if (audienciaCanal12 > 0) {
                double percentualCanal12 = audienciaCanal12 * 100.0 / totalPessoas;
                System.out.printf("Canal 12: %.2f%%\n", percentualCanal12);
            }
        }
    }
}
