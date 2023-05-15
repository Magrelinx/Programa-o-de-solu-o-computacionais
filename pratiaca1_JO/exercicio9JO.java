package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercicio9JO {
	public static void main(String[] args) {

		String catetoAstr = JOptionPane.showInputDialog("Digite o valor do cateto A:");
		double catetoA = Double.parseDouble(catetoAstr);

		String catetoBstr = JOptionPane.showInputDialog("Digite o valor do cateto B:");
		double catetoB = Double.parseDouble(catetoBstr);

		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
	}
}