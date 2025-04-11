import java.util.ArrayList;
import java.util.Scanner;

public class MenuEPI {
    public static void criarMenu() {
        Scanner input = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("\n--- Sistema de EPIs ---");
                System.out.println("1. Cadastrar EPI");
                System.out.println("2. Listar EPIs");
                System.out.println("3. Atualizar EPI");
                System.out.println("4. Remover EPI");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                opcao = input.nextInt();
                input.nextLine();
                switch (opcao) {
                    case 1 -> MenuEPI.criarMenu();
                    case 2 -> MenuEPI.criarMenu();
                    case 3 -> MenuEPI.criarMenu();
                    case 4 -> MenuEPI.criarMenu();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }

    }

