package pratica2;
import java.util.Scanner;

public class exercicio10 {

  public static void main(String[] args) {
  
    Scanner n= new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    double num1 = n.nextDouble();
    
    System.out.print("Digite o segundo número: ");
    double num2 = n.nextDouble();
    
    System.out.println("Escolha uma das opções abaixo:");
    System.out.println("1 - Somar os dois números");
    System.out.println("2 - Multiplicar os dois números");
    System.out.println("3 - Subtrair o número maior pelo número menor");
    System.out.println("4 - Dividir o primeiro número pelo segundo");
    
    int opcao =n.nextInt();
    
    if (opcao == 1) {
      System.out.println("O resultado da soma é: " + (num1 + num2));
    } else if (opcao == 2) {
      System.out.println("O resultado da multiplicação é: " + (num1 * num2));
    } else if (opcao == 3) {
      double diferenca = num1 - num2;
      if (num1 == num2) {
        System.out.println("Os números são iguais, a diferença é zero.");
      } else if (num1 > num2) {
        System.out.println("O resultado da subtração é: " + diferenca);
      } else {
        System.out.println("O resultado da subtração é: " + (-diferenca));
      }
    } else if (opcao == 4) {
      if (num2 == 0) {
        System.out.println("Não é possível dividir por zero!");
      } else {
        System.out.println("O resultado da divisão é: " + (num1 / num2));
      }
    } else {
      System.out.println("Opção inválida!");
    }
    
  }

}
