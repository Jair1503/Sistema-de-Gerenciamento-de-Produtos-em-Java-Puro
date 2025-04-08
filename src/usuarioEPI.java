import java.util.ArrayList;
import java.util.Scanner;

public class usuarioEPI {
    static ArrayList<String> Usuarios = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        int opcao;
        do {

            System.out.println("\n-----Sistema de Usuario-----");
            System.out.println("1. -Cadastrar Usuário-");
            System.out.println("2. -Listar Usuário-");
            System.out.println("3. -Atualizar Usuário-");
            System.out.println("4. -Remover Usuário-");
            System.out.println("0. -Sair-");
            System.out.print("Escolha uma Opção: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> listarUsuario();
                case 3 -> atualizarUsuario();
                case 4 -> removerUsuario();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção Inválida");

            }
        }while (opcao != 0) ;

    }

    static void cadastrarUsuario() {
        System.out.println("Digite o nome do usuário: ");
        String nome = input.nextLine();
        System.out.println("Usuário cadastrado com sucesso");
        System.out.println("Digite o cargo: ");
        String cargo = input.nextLine();
        Usuarios.add(nome + " - " + cargo);
        System.out.println("Cargo cadastrado com sucesso");
    }

    static void listarUsuario() {
        System.out.println("\n -Listar Usuário-");
        for (int i = 0; i < Usuarios.size(); i++) {
            System.out.println(i + " - " + Usuarios.get(i));
        }
    }

    static void atualizarUsuario(){
        listarUsuario();
        System.out.println("Digite o índice do Usuário: ");
        int index = input.nextInt();
        input.nextLine();
        if(index >= 0 && index < Usuarios.size()){
            System.out.println("Digite o novo Usuário: ");
            String novoNome = input.nextLine();
            Usuarios.set(index, novoNome);
            System.out.println("Usuário Atualizado.");
            System.out.println("Digite seu novo cargo: ");
            String novoCargo = input.nextLine();
            Usuarios.set(index, novoNome + " - " + novoCargo);
            System.out.println("Cargo Atualizado");
        }else {
            System.out.println("Usuário ou Cargo Inválido.");
        }
    }

    static void removerUsuario(){
        listarUsuario();
        System.out.println("Digite o índice para remover ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < Usuarios.size()){
            Usuarios.remove(index);
            System.out.println("Usuário Removido.");
        }else {
            System.out.println("Usuário não encontrado");
        }

    }
}
