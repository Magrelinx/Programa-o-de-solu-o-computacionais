package pratica10;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[10];
    System.out.println("Informe um vetor de 10 números:");
    for (int i = 0; i < 10; i++) {
      vetor[i] = scanner.nextInt();
    }

    System.out.println("Escolha o método de ordenação desejado:");
    System.out.println("1 - Bubble Sort");
    System.out.println("2 - Selection Sort");
    System.out.println("3 - Insertion Sort");
    int opcao = scanner.nextInt();

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
  }

  public static void bubbleSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (vetor[j] > vetor[j+1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = temp;
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
      int temp = vetor[i];
      vetor[i] = vetor[indiceMenor];
      vetor[indiceMenor] = temp;
    }
  }

  public static void insertionSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 1; i < n; i++) {
      int chave = vetor[i];
      int j = i - 1;
      while (j >= 0 && vetor[j] > chave) {
        vetor[j+1] = vetor[j];
        j = j - 1;
      }
      vetor[j+1] = chave;
    }
  }
}
