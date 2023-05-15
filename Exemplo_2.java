import javax.swing.JOptionPane;
public class Exemplo_2 {

	public static void main(String[] args) {

		String entrada;
		int numero1, numero2, soma;
		entrada = JOptionPane.showInputDialog("Digite o número: ");

		numero1 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Digite o número: ");
		
		numero2 = Integer.parseInt(entrada);
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		System.exit(0);
	}

}
