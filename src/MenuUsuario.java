import java.util.Scanner;

public class MenuUsuario {
    public static void criarMenu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu Usuários -----");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    usuarioEPI.cadastrarUsuario();
                    break;
                case 2:
                    usuarioEPI.listarUsuario();
                    break;
                case 3:
                    usuarioEPI.atualizarUsuario();
                    break;
                case 4:
                    usuarioEPI.removerUsuario();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}


