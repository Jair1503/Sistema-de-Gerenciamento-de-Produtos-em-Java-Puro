
import java.util.ArrayList;
import java.util.Scanner;

public class devolucaoEPI {
    static ArrayList<String> DevolucaoEPI = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int opcao;
        do {
            System.out.println("\n -----Sistema de Devoluções-----");
            System.out.println("1. -Cadastrar Devolução-");
            System.out.println("2. -Listar Devoluções-");
            System.out.println("3. -Atualizar Devoluções-");
            System.out.println("4. -Remover Devolução-");
            System.out.println("0. -Sair-");
            System.out.println("Escolha uma Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> cadastrarDevolucao();
                case 2 -> listarDevolucoes();
                case 3 -> atualizarDevolucoes();
                case 4 -> removerDevolucao();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção Inválida!");
            }
        } while (opcao != 0);
    }
    static void cadastrarDevolucao(){
        System.out.println("Digite o nome do colaborador: ");
        String colaborador = input.nextLine();
        System.out.println("Digite o nome do EPI: ");
        String EPI = input.nextLine();
        String data = obterDataValida("Digite a data de devolução (dd/mm/aaaa): ");
        DevolucaoEPI.add(colaborador + " - " + EPI + " - " +data);
        System.out.println("Devolução cadastrada com sucesso!. ");
    }
    static String obterDataValida(String mensagem) {
        String data = "";
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print(mensagem);
            data = input.nextLine();

            if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
                dataValida = true;
            } else {
                System.out.println("Data incorreta. Utilize o formato dd/mm/aaaa.");
            }
        }
        return data;
    }

    static void listarDevolucoes(){
        System.out.println("\n -Listar Devoluções- ");
        if (DevolucaoEPI.isEmpty()){
            System.out.println("Devolução não cadastrada! ");
        }else {
            for (int i = 0; i < DevolucaoEPI.size(); i++){
                System.out.println(i + " - " +DevolucaoEPI.get(i));
            }
        }
    }

    static void atualizarDevolucoes(){
        listarDevolucoes();
        System.out.println("Digite o índice da devolução a atualizar: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < DevolucaoEPI.size()){
            System.out.println("Digite o novo nome do colaborador: ");
            String novoColaborador = input.nextLine();
            System.out.println("Digite o novo nome do EPI: ");
            String novoEpi = input.nextLine();
            String novaData = obterDataValida("Digite a nova data de devolução (dd/mm/aaaa): ");
            DevolucaoEPI.set(index, novoColaborador + " - " + novoEpi + " - " + novaData);
            System.out.println("Devolução Atualizada! ");
        }else {
            System.out.println("Devolução Inválida! ");
        }

    }

    static void removerDevolucao(){
        listarDevolucoes();
        System.out.println("Digite o índice da devolução a remover: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < DevolucaoEPI.size()){
            DevolucaoEPI.remove(index);
            System.out.println("Devolução Removida! ");
        }else {
            System.out.println("Devolução não encontrada!");
        }
    }
}
