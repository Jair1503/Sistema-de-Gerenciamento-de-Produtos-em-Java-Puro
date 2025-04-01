import java.util.ArrayList;
import java.util.Scanner;

public class Devolucoes {
    static ArrayList<String> devolucoes = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    private static void main(String[] args){
        int opcao;
        do{
            System.out.println("\n --- Lista de devolucoes --- ");
            System.out.println("1. Cadastrar devolução ");
            System.out.println("2. Listar devoluçoes ");
            System.out.println("3. Atualizar devolucões ");
            System.out.println("4. Remover devoluções ");
            System.out.println("0. Saindo... ");
            System.out.println(" Escolha ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1 -> devolucoes.cadastrarDevolucao();
                    case 2 -> devolucoes.listarDevolucoes();
                        case 3 -> devolucoes.atualizarDevolucao();
                            case 4 -> devolucoes.removerDevolucao();
                                case 0 -> System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);
    }
    static void cadastrarDevolucao(){
        System.out.println("Digite o nome do usuário");

    }




}
