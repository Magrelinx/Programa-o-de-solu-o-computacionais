package pratica3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula, nota1, nota2, nota3;
        double media;

        System.out.print("Digite a matrícula do aluno (-1 para sair): ");
        matricula = sc.nextInt();

        while (matricula >= 0) {
            System.out.print("Digite a primeira nota do aluno: ");
            nota1 = sc.nextInt();
            System.out.print("Digite a segunda nota do aluno: ");
            nota2 = sc.nextInt();
            System.out.print("Digite a terceira nota do aluno: ");
            nota3 = sc.nextInt();

            media = (nota1 + nota2 + nota3) / 3.0;

            if (media >= 70) {
                System.out.println("Aluno aprovado");
            } else if (media >= 60 && media < 70) {
                System.out.println("Aluno em recuperação");
            } else {
                System.out.println("Aluno reprovado");
            }

            System.out.print("Digite a matrícula do aluno (-1 para sair): ");
            matricula = sc.nextInt();
        }

        System.out.println("Programa encerrado.");
    }
}
