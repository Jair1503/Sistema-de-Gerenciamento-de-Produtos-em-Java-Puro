import java.awt.*;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Sistema de Controle -----");
            System.out.println("1. Menu Usuários");
            System.out.println("2. Menu EPIs");
            System.out.println("3. Menu Empréstimos");
            System.out.println("4. Menu Devoluções");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    MenuUsuario.criarMenu();
                    break;
                case 2:
                    MenuEPI.criarMenu();
                    break;
                case 3: MenuEmprestimo.criarMenu();
                    break;
                case 4:
                    MenuDevolucao.criarMenu();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}


