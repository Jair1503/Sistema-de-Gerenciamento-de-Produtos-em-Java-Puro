import java.util.ArrayList;
import java.util.Scanner;

public class SistemaModular {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> epis = new ArrayList<>();
    static ArrayList<String> funcionarios = new ArrayList<>();
    static ArrayList<String> emprestimos = new ArrayList<>();
    static ArrayList<String> log = new ArrayList<>();


    public static void main(String[] args) {

        int opcao;
        do {
            System.out.println(" ==== SISTEMA DE GERENCIAMENTO ==== ");
            System.out.println("1. Módulo EPIS ");
            System.out.println("2. Módulo Funcionários ");
            System.out.println("3. Módulo Empréstimos");
            System.out.println("0. Sair ");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    SubMenu.executar(epis, "EPIs", log, scanner);
                    break;
                case 2:
                    SubMenu.executar(funcionarios, "Funcionários", log, scanner);
                    break;
                case 3:
                    SubMenu.executar(emprestimos, "Empréstimos", log, scanner);
                    break;
                case 0: System.out.println("Encerrando...");
                default: System.out.println("Opção inválida");
            }

        } while (opcao != 0);
        System.out.println("\n =====  Log de operacções  =====");
        for (String entrada : log) {
            System.out.println(entrada);
        }
        scanner.close();
    }
}



