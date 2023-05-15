package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio10JO {
	public static void main(String[] args) {

		String raiostr = JOptionPane.showInputDialog("Digite o valor do raio da esfera:");
		double raio = Double.parseDouble(raiostr);

		double comprimento = 2 * Math.PI * raio;

		double area = Math.PI * Math.pow(raio, 2);

		double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

		JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comprimento + "\n" + "Área da esfera: " + area
				+ "\n" + "Volume da esfera: " + volume);
	}
}