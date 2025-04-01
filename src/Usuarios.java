import java.util.ArrayList;
import  java.util.Scanner;

public class Usuarios {
    static ArrayList<String> usuarios = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Usuários ---");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> Usuarios.cadastrarUsuario();
                case 2 -> Usuarios.listarUsuarios();
                case 3 -> Usuarios.atualizarUsuario();
                case 4 -> Usuarios.removerUsuario();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void cadastrarUsuario() {
        System.out.println("Digite o nome do usuário : ");
        String nome = Usuarios.input.nextLine();
       Usuarios.usuarios.add(nome);
        System.out.println(" Usuário cadastrado com sucesso");
    }

    static void atualizarUsuario() {
        System.out.println("Digite o índice do Usuário a atualizar: ");
        int index = Usuarios.input.nextInt();
        Usuarios.input.nextLine();

        if (index >= 0 && index < Usuarios.usuarios.size()) ;
        System.out.println("Digite o novo nome: ");
        String novoNome = Usuarios.input.nextLine();
       Usuarios.usuarios.set(index, novoNome);
        System.out.println();
    }

    static void listarUsuarios() {
        System.out.println("\n---- Lista de Usuários ---");
        for (int i = 0; i < Usuarios.usuarios.size(); i++) {
            System.out.println(i + "-" + Usuarios.usuarios.get(i));

        }
    }

    public static void removerUsuario() {
        listarUsuarios();
        System.out.println("Digite o índice a ser removido: ");
        int index = Usuarios.input.nextInt();
       Usuarios.input.nextLine();

        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
            System.out.println("Usuário removido");
        } else {
            System.out.println("Índice inválido");
        }
    }
}

