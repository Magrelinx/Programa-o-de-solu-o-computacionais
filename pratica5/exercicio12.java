package pratica5;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
