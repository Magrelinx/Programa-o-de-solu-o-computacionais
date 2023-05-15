package pratiaca1_JO;

import javax.swing.JOptionPane;

public class exercico11JO {

	public static void main(String[] args) {

		String numString = JOptionPane.showInputDialog("Informe um número: ");
		int num = Integer.parseInt(numString);

		String resultado = num + " x 0 = " + (num * 0) + "\n" +
				   num + " x 1 = " + (num * 1) + "\n" +
				   num + " x 2 = " + (num * 2) + "\n" +
				   num + " x 3 = " + (num * 3) + "\n" +
				   num + " x 4 = " + (num * 4) + "\n" +
				   num + " x 5 = " + (num * 5) + "\n" +
				   num + " x 6 = " + (num * 6) + "\n" +
				   num + " x 7 = " + (num * 7) + "\n" +
				   num + " x 8 = " + (num * 8) + "\n" +
				   num + " x 9 = " + (num * 9) + "\n" +
				   num + " x 10 = " + (num * 10) + "\n";

		JOptionPane.showMessageDialog(null, resultado);
	}
}