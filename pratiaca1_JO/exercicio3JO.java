package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio3JO {

	public static void main(String[] args) {

		String cotacaoStr = JOptionPane.showInputDialog("Digite a cotação atual do dólar em reais:");
		double cotacao = Double.parseDouble(cotacaoStr);

		String valorDolarStr = JOptionPane.showInputDialog("Digite o valor em dólares:");
		double valorDolar = Double.parseDouble(valorDolarStr);

		double valorReal = valorDolar * cotacao;

		JOptionPane.showMessageDialog(null, "O valor em reais é: R$ " + valorReal);
	}
}