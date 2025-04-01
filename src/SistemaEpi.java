import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEpi {
static ArrayList<String> epis = new ArrayList<>();
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do{
        System.out.println("\n---- Sistema de EPIS----");
        System.out.println("1. Cadastrar EPI");
        System.out.println("2. Listar EPIS");
        System.out.println("3. Atualizar EPI");
        System.out.println("4. Remover EPI");
        System.out.println("0. Sair");
        System.out.println("Escolha: ");
        opcao = input.nextInt();

        switch(opcao){
            case 1 -> cadastrarEPI();
            case 2 -> listarEPIs();
            case 3 -> atualizarEPI();
            case 4 -> removerEPI();
            case 0 -> System.out.println("Saindo");
            default -> System.out.println("Opção inválida");
        }
        } while(opcao != 0);
    }

    private static void removerEPI() {

    }

    private static void atualizarEPI() {
        listarEPIs();
        System.out.println("Digite o índice do EPI a atualizar: ");
        int index = input.nextInt();
        input.nextLine();

        if(index >= 0 && index < epis.size());
        System.out.println("Digite o novo nome: ");
        String novoNome = input.nextLine();
        epis.set(index, novoNome);
        System.out.println();
    }

    private static void listarEPIs() {
        System.out.println("\n---- Lista de EPIs---");
        for (int i = 0; i < epis.size(); i++) {
            System.out.println(i + "-" + epis.get(i));
        }
    }
    private static void cadastrarEPI() {
        System.out.println("Digite o nome do EPI : ");
        String nome = input.nextLine();
        epis.add(nome);
        System.out.println("EPI cadastrado com sucesso");
    }
}