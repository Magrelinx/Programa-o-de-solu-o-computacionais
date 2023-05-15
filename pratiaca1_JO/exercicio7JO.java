package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio7JO {

	public static void main(String[] args) {

		String salarioMinimoStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
		double salarioMinimo = Double.parseDouble(salarioMinimoStr);

		String salarioFuncionarioStr = JOptionPane.showInputDialog("Digite o valor seu salario:");
		double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);

		double quantidadeSalarios = salarioFuncionario / salarioMinimo;

		JOptionPane.showMessageDialog(null, "O funcionário recebe " + quantidadeSalarios + " salários mínimos.");
	}
}
