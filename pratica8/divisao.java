package pratica8;

public class divisao {
	   public static int dividir(int dividendo, int divisor) throws ArithmeticException {
	      if (divisor == 0) {
	         throw new ArithmeticException("Erro: Divisão por zero!");
	      }
	      
	      if (dividendo < 0) {
	         throw new ArithmeticException("Erro: Dividendo menor que zero!");
	      }
	      
	      return dividendo / divisor;
	   }
	}
