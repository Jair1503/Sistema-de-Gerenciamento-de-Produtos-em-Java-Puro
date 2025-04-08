import java.util.ArrayList;
import java.util.Scanner;

public class emprestimoEPI {
    static ArrayList<String> EmprestimoEPI = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n-----Sistema de Empréstimo-----");
            System.out.println("1. -Cadastrar Empréstimo-");
            System.out.println("2. -Listar Empréstimos-");
            System.out.println("3. -Atualizar Empréstimo-");
            System.out.println("4. -Remover Empréstimo-");
            System.out.println("0. -Sair-");
            System.out.print("Escolha uma Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> cadastrarEmprestimo();
                case 2 -> listarEmprestimos();
                case 3 -> atualizarEmprestimo();
                case 4 -> removerEmprestimo();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção Inválida");
            }

        } while (opcao != 0);

    }

    static void cadastrarEmprestimo() {
        System.out.println("Digite o nome do colaborador: ");
        String colaborador = input.nextLine();
        System.out.println("Digite o nome do EPI: ");
        String Epi = input.nextLine();
        String data = obterDataValida("Digite a data de empréstimo (dd/mm/aaaa): ");
        EmprestimoEPI.add(colaborador + " - " + Epi + " - " + data);
        System.out.println("Cadastro realizado com sucesso!");
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
                System.out.println("Data incorreta. Utilize o formato (dd/mm/aaaa).");
            }
        }
        return data;
    }

    static void listarEmprestimos() {
        System.out.println("\n -Listar Empréstimo-");
        if (EmprestimoEPI.isEmpty()){
            System.out.println("Empréstimo não cadastrado! ");
        }else {
            for (int i = 0; i < EmprestimoEPI.size(); i++){
                System.out.println(i + " - " + EmprestimoEPI.get(i));
            }
        }
    }

    static void atualizarEmprestimo() {
        listarEmprestimos();
        System.out.println("Digite o índice do empréstimo á atualizar: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < EmprestimoEPI.size()) {
            System.out.println("Digite o novo colaborador: ");
            String novoColaborador = input.nextLine();
            System.out.println("Digite o novo empréstimo: ");
            String novoEmprestimo = input.nextLine();
            String novaData = obterDataValida("Digite a nova data do empréstimo (dd/mm/aaaa): ");
            EmprestimoEPI.set(index, novoColaborador + " - " + novoEmprestimo + " - " + novaData );
            System.out.println("Empréstimo Atualizado!");
        }else {
            System.out.println("Empréstimo Inválido!");
        }
    }
    static void removerEmprestimo(){
        listarEmprestimos();
        System.out.println("Digite o índice a ser removido: ");
        int index = input.nextInt();
        if (index >= 0 && index < EmprestimoEPI.size()){
            EmprestimoEPI.remove(index);
            System.out.println("Empréstimo Removido!");
        }else{
            System.out.println("Empréstimo não encontrado!");
        }

    }
}

