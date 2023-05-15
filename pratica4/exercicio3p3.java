package pratica4;


import javax.swing.JOptionPane;

public class exercicio3p3 {
    public static void main (String args[]) {
        int idade;
        double salario, nota;
        String sexo;

        do {
            String entrada = JOptionPane.showInputDialog("Informe sua idade: ");
            idade = Integer.parseInt(entrada);
        } while (idade < 0 || idade > 150);

        do {
            String entrada = JOptionPane.showInputDialog("Informe seu salário: ");
            salario = Double.parseDouble(entrada);
        } while (salario <= 0);

        do {
            String entrada = JOptionPane.showInputDialog("Informe sua nota: ");
            nota = Double.parseDouble(entrada);
        } while (nota < 0 || nota > 10);

        do {
            String entrada = JOptionPane.showInputDialog("Informe seu sexo (M/F): ");
            sexo = entrada.toUpperCase();
        } while (!sexo.equals("M") && !sexo.equals("F"));

        JOptionPane.showMessageDialog(null, "Dados informados corretamente!");
        System.exit(0);
    }
}
