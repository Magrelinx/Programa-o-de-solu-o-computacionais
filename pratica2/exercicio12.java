package pratica2;

import java.util.Scanner;

public class exercicio12 {

  public static void main(String[] args) {
  
    Scanner n= new Scanner(System.in);
    
    System.out.print("Digite a idade do cliente: ");
    int idade = n.nextInt();
    
    System.out.print("Digite o sexo do cliente (M/F): ");
    String sexo = n.next();
    
    double mensalidade = 0.0;
    
    if (sexo.equalsIgnoreCase("M")) {
      if (idade <= 15) {
        mensalidade = 60.0;
      } else if (idade >= 16 && idade <= 18) {
        mensalidade = 75.0;
      } else if (idade >= 19 && idade <= 30) {
        mensalidade = 90.0;
      } else if (idade >= 31 && idade <= 40) {
        mensalidade = 85.0;
      } else {
        mensalidade = 80.0;
      }
    } else if (sexo.equalsIgnoreCase("F")) {
      if (idade <= 18) {
        mensalidade = 60.0;
      } else if (idade >= 19 && idade <= 25) {
        mensalidade = 90.0;
      } else if (idade >= 26 && idade <= 40) {
        mensalidade = 85.0;
      } else {
        mensalidade = 80.0;
      }
    }
    
    System.out.println("A mensalidade a ser paga é: R$" + mensalidade);
    
  }

}
