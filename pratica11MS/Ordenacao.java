package pratica11MS;

class Ordenacao {
    public void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public void quicksort(int[] vetor, int low, int high) {
        if (low < high) {
            int pi = partition(vetor, low, high);
            quicksort(vetor, low, pi - 1);
            quicksort(vetor, pi + 1, high);
        }
    }

    private int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (vetor[j] < pivot) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

    public void mergeSort(int[] vetor, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(vetor, left, middle);
            mergeSort(vetor, middle + 1, right);
            merge(vetor, left, middle, right);
        }
    }

    private void merge(int[] vetor, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = vetor[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = vetor[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                vetor[k] = leftArray[i];
                i++;
            } else {
                vetor[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = rightArray[j];
            j++;
            k++;
        }
    }
}