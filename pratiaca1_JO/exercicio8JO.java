package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio8JO {

	public static void main(String[] args) {

		String pesoStr = JOptionPane.showInputDialog("Digite o peso seu peso:");
		double peso = Double.parseDouble(pesoStr);

		double novoPesoEngordar = peso * 1.15;

		double novoPesoEmagrecer = peso * 0.8;

		JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar);

		JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer);
	}
}