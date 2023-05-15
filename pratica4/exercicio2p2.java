package pratica4;

import javax.swing.JOptionPane;
public class exercicio2p2 {
    public static void main(String args[]) {
        String entrada;
        double nota, salario;
        char sexo;
        int idade;

        do {
            entrada = JOptionPane.showInputDialog("Informe a nota (0 a 10): ");
            nota = Double.parseDouble(entrada);
        } while (nota < 0 || nota > 10);

        do {
            entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
            salario = Double.parseDouble(entrada);
        } while (salario <= 0);

        do {
            entrada = JOptionPane.showInputDialog("Informe o sexo (M ou F): ");
            sexo = entrada.charAt(0);
            sexo = Character.toUpperCase(sexo);
        } while (sexo != 'M' && sexo != 'F');

        do {
            entrada = JOptionPane.showInputDialog("Informe a idade (0 a 150): ");
            idade = Integer.parseInt(entrada);
        } while (idade < 0 || idade > 150);

        int resp = JOptionPane.showConfirmDialog(null, "Dados informados corretamente. Deseja continuar?");
        if (resp == JOptionPane.YES_OPTION) {
            entrada = "sim";
        } else {
            entrada = "não";
        }

        System.exit(0);
    }
}
