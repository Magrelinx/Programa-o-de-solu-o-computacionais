package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio4JO {

	public static void main(String[] args) {

		String salarioStr = JOptionPane.showInputDialog("Digite o seu salario atual:");
		double salarioAtual = Double.parseDouble(salarioStr);

		double novoSalario = salarioAtual * 1.25;

		JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: R$ " + novoSalario);
	}
}