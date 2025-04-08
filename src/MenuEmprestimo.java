import java.util.Scanner;

public class MenuEmprestimo {
    public static void criarMenu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu Empréstimos -----");
            System.out.println("1. Cadastrar Empréstimo");
            System.out.println("2. Listar Empréstimos");
            System.out.println("3. Atualizar Empréstimo");
            System.out.println("4. Remover Empréstimo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    emprestimoEPI.cadastrarEmprestimo();
                    break;
                case 2:
                    emprestimoEPI.listarEmprestimos();
                    break;
                case 3:
                    emprestimoEPI.atualizarEmprestimo();
                    break;
                case 4:
                    emprestimoEPI.removerEmprestimo();
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




