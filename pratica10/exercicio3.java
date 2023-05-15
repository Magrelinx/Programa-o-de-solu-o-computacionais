package pratica10;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      int[] vetor = new int[10];
      System.out.println("Informe um vetor de 10 números:");
      for (int i = 0; i < 10; i++) {
        vetor[i] = scanner.nextInt();
      }

      System.out.println("Escolha o método de ordenação desejado:");
      System.out.println("1 - Bubble Sort");
      System.out.println("2 - Selection Sort");
      System.out.println("3 - Insertion Sort");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          bubbleSort(vetor);
          break;
        case 2:
          selectionSort(vetor);
          break;
        case 3:
          insertionSort(vetor);
          break;
        default:
          System.out.println("Opção inválida.");
      }

      System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

      System.out.println("Deseja ordenar outro vetor?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      opcao = scanner.nextInt();
    } while (opcao == 1);
  }

  public static void bubbleSort(int[] vetor) {
    int n = vetor.length;
    int temp = 0;
    for(int i = 0; i < n; i++) {
      for(int j=1; j < (n-i); j++) {
        if(vetor[j-1] > vetor[j]) {
          temp = vetor[j-1];
          vetor[j-1] = vetor[j];
          vetor[j] = temp;
        }
      }
    }
  }

  public static void selectionSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 0; i < n-1; i++) {
      int indiceMenor = i;
      for (int j = i+1; j < n; j++) {
        if (vetor[j] < vetor[indiceMenor]) {
          indiceMenor = j;
        }
      }
      int temp = vetor[indiceMenor];
      vetor[indiceMenor] = vetor[i];
      vetor[i] = temp;
    }
  }

  public static void insertionSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 1; i < n; ++i) {
      int key = vetor[i];
      int j = i - 1;

      while (j >= 0 && vetor[j] > key) {
        vetor[j + 1] = vetor[j];
        j = j - 1;
      }
      vetor[j + 1] = key;
    }
  }
}
