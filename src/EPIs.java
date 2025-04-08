import java.util.Scanner;

public class EPIs {
    public static void criarMenu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- CRUD de EPIs -----");
            System.out.println("1. Cadastrar EPI");
            System.out.println("2. Listar EPIs");
            System.out.println("3. Atualizar EPI");
            System.out.println("4. Remover EPI");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    MenuEPI.cadastrarEPI();
                    break;
                case 2:
                    MenuEPI.listarEPIs();
                    break;
                case 3:
                    MenuEPI.atualizarEPI();
                    break;
                case 4:
                    MenuEPI.removerEPI();
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




