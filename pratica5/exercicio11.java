package pratica5;

import java.util.Scanner;

public class exercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorMasculino = 0;
        int contadorFeminino = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o sexo da " + i + "ª pessoa (M/F): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Informe o peso da " + i + "ª pessoa: ");
            double peso = sc.nextDouble();
            
            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                contadorMasculino++;
            } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
                contadorFeminino++;
            }
        }
        
        System.out.println("Existem " + contadorMasculino + " pessoas do sexo masculino com peso entre 60 e 80 kg.");
        System.out.println("Existem " + contadorFeminino + " pessoas do sexo feminino com peso entre 50 e 70 kg.");
    }
}

