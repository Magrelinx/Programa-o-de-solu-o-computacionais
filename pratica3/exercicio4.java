package pratica3;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFilhos = 0;
        double salario, totalSalarios = 0, mediaSalarios = 0, mediaFilhos = 0;
        int numPessoas = 0;

        System.out.print("Informe o salário (negativo para encerrar): ");
        salario = scanner.nextDouble();

        while (salario >= 0) {
            System.out.print("Informe o número de filhos: ");
            numFilhos = scanner.nextInt();

            totalSalarios += salario;
            mediaSalarios = totalSalarios / ++numPessoas;
            mediaFilhos = (mediaFilhos * (numPessoas - 1) + numFilhos) / numPessoas;

            System.out.print("Informe o salário (negativo para encerrar): ");
            salario = scanner.nextDouble();
        }

        System.out.println("Média salarial da população: " + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
    }
}
