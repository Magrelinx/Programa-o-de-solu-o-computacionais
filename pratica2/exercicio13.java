package pratica2;
import java.util.Scanner;

public class exercicio13 {
  public static void main(String[] args) {
  
    Scanner n = new Scanner(System.in);
    
    System.out.println("Informe o tipo de apartamento (Simples ou Duplo):");
    String tipoApartamento = n.nextLine();
    
    System.out.println("Informe a quantidade de dias hospedados:");
    int quantidadeDias = n.nextInt();
    
    double valorDiaria = 0.0;
    
    if (tipoApartamento.equalsIgnoreCase("Simples")) {
      if (quantidadeDias < 10) {
        valorDiaria = 100.0;
      } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
        valorDiaria = 90.0;
      } else {
        valorDiaria = 80.0;
      }
    } else if (tipoApartamento.equalsIgnoreCase("Duplo")) {
      if (quantidadeDias < 10) {
        valorDiaria = 140.0;
      } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
        valorDiaria = 120.0;
      } else {
        valorDiaria = 100.0;
      }
    }
    
    double total = valorDiaria * quantidadeDias;
    
    System.out.printf("O valor total a ser pago é R$ %.2f\n", total);
    
    n.close();
  }
}
