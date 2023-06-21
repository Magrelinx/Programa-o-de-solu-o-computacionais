package pratica11MS;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor = new int[10];
        char opcao;

        do {
            System.out.println("Escolha o método de ordenação: ");
            System.out.println("1 - Bolha");
            System.out.println("2 - Seleção");
            System.out.println("3 - Inserção");
            System.out.println("4 - Quicksort");
            System.out.println("5 - Merge Sort");
            int metodo = scanner.nextInt();

            System.out.println("Informe 10 números para serem ordenados: ");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (metodo) {
                case 1:
                    ordenacao.bolha(vetor);
                    break;
                case 2:
                    ordenacao.selecao(vetor);
                    break;
                case 3:
                    ordenacao.insercao(vetor);
                    break;
                case 4:
                    ordenacao.quicksort(vetor, 0, vetor.length - 1);
                    break;
                case 5:
                    ordenacao.mergeSort(vetor, 0, vetor.length - 1);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Vetor ordenado: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();

            System.out.println("Deseja continuar? (S/N)");
            opcao = scanner.next().charAt(0);
        } while (opcao == 'S' || opcao == 's');
    }
}