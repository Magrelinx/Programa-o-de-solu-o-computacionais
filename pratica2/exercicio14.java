package pratica2;

import java.util.Scanner;

public class exercicio14{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Digite o comando Git que deseja saber mais (clone, fetch, pull): ");
        String command = n.nextLine();

        if (command.equals("clone")) {
            System.out.println("O comando 'git clone' é usado para criar uma cópia do repositório remoto em seu computador. Ele baixa todos os arquivos e histórico do projeto para sua máquina. Exemplo: git clone https://github.com/meuusuario/meuprojeto.git");
        } else if (command.equals("fetch")) {
            System.out.println("O comando 'git fetch' é usado para atualizar o seu repositório local com as alterações do repositório remoto sem aplicá-las ao seu código atual. Isso permite que você veja as alterações que foram feitas antes de mesclá-las ao seu código. Exemplo: git fetch origin");
        } else if (command.equals("pull")) {
            System.out.println("O comando 'git pull' é usado para mesclar as alterações do repositório remoto com o seu repositório local. Ele baixa todas as alterações que foram feitas no repositório remoto e as mescla com seu código local. Exemplo: git pull origin master");
        } else {
            System.out.println("Comando inválido");
        }
        n.close();
    }
}
