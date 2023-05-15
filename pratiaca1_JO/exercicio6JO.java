package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio6JO {
	public static void main(String[] args) {

		String celsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
		double celsius = Double.parseDouble(celsiusStr);

		double fahrenheit = (celsius * 1.8) + 32;

		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
	}
}