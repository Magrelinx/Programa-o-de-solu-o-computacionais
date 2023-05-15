package pratica3;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota, faltas;
        int qtdAprovados = 0, qtdReprovados = 0;
        int maiorNota = 0, menorNota = 100;
        int somaNotas = 0, qtdNotas = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a nota final do aluno (-1 para sair): ");
            nota = sc.nextInt();

            if (nota < 0) {
                continuar = false;
            } else {
                System.out.print("Digite o total de faltas do aluno: ");
                faltas = sc.nextInt();

                if (nota >= 90) qtdAprovados++;

                if (nota < 70 || faltas >= 20) qtdReprovados++;

                if (nota > maiorNota) maiorNota = nota;
                if (nota < menorNota) menorNota = nota;

                somaNotas += nota;
                qtdNotas++;
            }
        }

        System.out.println("Quantidade de alunos aprovados: " + qtdAprovados);
        System.out.println("Quantidade de alunos reprovados: " + qtdReprovados);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

        if (qtdNotas > 0) {
            double media = (double) somaNotas / qtdNotas;
            System.out.println("Média de notas da turma: " + media);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        sc.close();
    }
}
