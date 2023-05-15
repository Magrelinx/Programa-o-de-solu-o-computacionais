package pratica6;

import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        int[] posicoesNegativas = new int[10];
        int contadorNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            numeros[i] = sc.nextDouble();
            if (numeros[i] < 0) {
                posicoesNegativas[contadorNegativos] = i;
                contadorNegativos++;
            }
        }

        System.out.print("Vetor: [ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");

        if (contadorNegativos > 0) {
            System.out.print("Posições dos números negativos: [ ");
            for (int i = 0; i < contadorNegativos; i++) {
                System.out.print(posicoesNegativas[i] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println("Não há números negativos no vetor.");
        }
    }
}
