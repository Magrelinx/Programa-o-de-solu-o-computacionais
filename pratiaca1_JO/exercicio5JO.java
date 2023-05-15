package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio5JO {
	public static void main(String[] args) {
	
		String diagonalMaiorStr = JOptionPane.showInputDialog("Digite a diagonal maior do losango:");
		double diagonalMaior = Double.parseDouble(diagonalMaiorStr);

		
		String diagonalMenorStr = JOptionPane.showInputDialog("Digite a diagonal menor do losango:");
		double diagonalMenor = Double.parseDouble(diagonalMenorStr);

	
		double area = (diagonalMaior * diagonalMenor) / 2;

		
		JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
	}
}