import java.util.ArrayList;
import java.util.Scanner;

public class Epis {
    static ArrayList<String> epis = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
                case 1 -> Epis.cadastrarEPI();
                case 2 -> Epis.listarEPIs();
                case 3 -> Epis.atualizarEPI();
                case 4 -> Epis.removerEPI();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    private static void cadastrarEPI() {
        System.out.println("Digite o nome do EPI : ");
        String nome = Epis.input.nextLine();
        Epis.epis.add(nome);
        System.out.println("EPI cadastrado com sucesso");
    }

    static void atualizarEPI() {
        listarEPIs();
        System.out.println("Digite o índice do EPI a atualizar: ");
        int index = Epis.input.nextInt();
        Epis.input.nextLine();

        if (index >= 0 && index < Epis.epis.size()) ;
        System.out.println("Digite o novo nome: ");
        String novoNome = Epis.input.nextLine();
        Epis.epis.set(index, novoNome);
        System.out.println();
    }

    static void listarEPIs() {
        System.out.println("\n---- Lista de EPIs---");
        for (int i = 0; i < Epis.epis.size(); i++) {
            System.out.println(i + "-" + Epis.epis.get(i));

        }
    }

    public static void removerEPI() {
        listarEPIs();
        System.out.println("Digite o índice a ser removido: ");
        int index = Epis.input.nextInt();
        Epis.input.nextLine();

        if (index >= 0 && index < Epis.epis.size()) {
            Epis.epis.remove(index);
            System.out.println("EPI removido");
        } else {
            System.out.println("Índice inválido");
        }
    }
}






