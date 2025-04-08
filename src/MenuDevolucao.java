import java.util.Scanner;

public class MenuDevolucao {
    public static void criarMenu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu Devoluções -----");
            System.out.println("1. Cadastrar Devolução");
            System.out.println("2. Listar Devoluções");
            System.out.println("3. Atualizar Devolução");
            System.out.println("4. Remover Devolução");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    devolucaoEPI.cadastrarDevolucao();
                    break;
                case 2:
                    devolucaoEPI.listarDevolucoes();
                    break;
                case 3:
                    devolucaoEPI.atualizarDevolucoes();
                    break;
                case 4:
                    devolucaoEPI.removerDevolucao();
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





