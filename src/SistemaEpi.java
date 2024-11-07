package src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEpi {
    static ArrayList<String> SistemaEpi = new ArrayList<> ();
    static Scanner input = new Scanner (System.in);

    public static void main (String[] args) {
        int opcao;

        do {
            System.out.println ("\n---- Sistema de EPIS----");
            System.out.println ("1. Cadastrar EPI");
            System.out.println ("2. Listar EPIS");
            System.out.println ("3. Atualizar EPI");
            System.out.println ("4. Remover EPI");
            System.out.println ("0. Sair");
            System.out.println ("Escolha: ");
            opcao = input.nextInt ();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadastrarEPI ();
                case 2 -> listarEPIs ();
                case 3 -> atualizarEPI ();
                case 4 -> removerEPI ();
                case 0 -> System.out.println ("Saindo");
                default -> System.out.println ("Opção inválida");
            }
        } while (opcao != 0);
    }

    static void cadastrarEPI () {
        System.out.println ("Digite o nome do EPI : ");
        String nome = input.nextLine ();
        SistemaEpi.add (nome);
        System.out.println ("EPI cadastrado com sucesso");
    }

    static void listarEPIs () {
        System.out.println ("\n---- Lista de EPIs---");
        for (int i = 0; i<SistemaEpi.size (); i++) {
            System.out.println (i + "-" + SistemaEpi.get (i));
        }
    }

    static void atualizarEPI () {
        listarEPIs ();
        System.out.println ("Digite o índice do EPI a atualizar: ");
        int index = input.nextInt ();
        input.nextLine ();

        if (index >= 0 && index < SistemaEpi.size ()) {
            System.out.println ("Digite o novo nome: ");
            String novoNome = input.nextLine ();
            SistemaEpi.set (index, novoNome);
            System.out.println ("EPI atualizado com sucesso");
        } else {
            System.out.println ("Índice inválido");
        }
    }

    private static void removerEPI() {
        System.out.println ("Digite o nome do EPI: ");
        String novoNome = input.nextLine();
     SistemaEpi.remove(novoNome);
        System.out.println ("EPI removido com sucesso");

    }
}