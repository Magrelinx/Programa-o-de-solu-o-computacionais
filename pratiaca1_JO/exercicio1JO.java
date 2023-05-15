package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio1JO {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");

		float n1 = Float.parseFloat(nota1);
		float n2 = Float.parseFloat(nota2);
		float n3 = Float.parseFloat(nota3);

		float media = (n1 + n2 + n3) / 3;

		JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
	}
}