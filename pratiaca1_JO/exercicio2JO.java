package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio2JO {

	public static void main(String[] args) {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

		int idadeAtual = anoAtual - anoNascimento;
		JOptionPane.showMessageDialog(null, "A idade da pessoa no ano atual é: " + idadeAtual + " anos.");

		int idade2050 = 2050 - anoNascimento;
		JOptionPane.showMessageDialog(null, "A idade da pessoa em 2050 será: " + idade2050 + " anos.");
	}
}