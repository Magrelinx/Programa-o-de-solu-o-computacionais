package pratica2;

import java.util.Scanner;

public class exercicio11 {

  public static void main(String[] args) {
  
    Scanner n = new Scanner(System.in);
    
    System.out.print("Digite o número de diárias: ");
    int numDiarias = n.nextInt();
    
    double precoDiaria = 500.0;
    double taxaServicos = 0.0;
    
    if (numDiarias < 15) {
      taxaServicos = 15.0;
    } else if (numDiarias == 15) {
      taxaServicos = 10.0;
    } else {
      taxaServicos = 5.0;
    }
    
    double total = numDiarias * precoDiaria + numDiarias * taxaServicos;
    
    System.out.println("O total a ser pago é: R$" + total);
    
  }

}
