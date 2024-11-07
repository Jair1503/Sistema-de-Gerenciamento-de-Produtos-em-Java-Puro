package src;

import java.util.ArrayList;
import  java.util.Scanner;
public class Usuarios {
    static ArrayList<String> Usuarios = new ArrayList<> ();
    static Scanner input = new Scanner (System.in);

    public static void main (String[] args) {
        int opcao;

        do {
            System.out.println ("\n---- Sistema Cadastro de Usuários----");
            System.out.println ("1. Cadastrar Usuário");
            System.out.println ("2. Listar Usuários");
            System.out.println ("3. Atualizar Usuário");
            System.out.println ("4. Remover Usuário");
            System.out.println ("0. Sair");
            System.out.println ("Escolha: ");
            opcao = input.nextInt ();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadastrarUsuario ();
                case 2 -> listarUsuarios ();
                case 3 -> atualizarUsuario ();
                case 4 -> removerUsuario ();
                case 0 -> System.out.println ("Saindo");
                default -> System.out.println ("Opção inválida");
            }
        } while (opcao != 0);
    }

    static void cadastrarUsuario () {
        System.out.println ("Digite o nome do Usuário : ");
        String nome = input.nextLine ();
        Usuarios.add (nome);
        System.out.println ("Usuário cadastrado com sucesso");
    }

    static void listarUsuarios () {
        System.out.println ("\n---- Lista de Usuários---");
        for (int i = 0; i<Usuarios.size (); i++) {
            System.out.println (i + "-" + Usuarios.get (i));
        }
    }

    static void atualizarUsuario () {
        listarUsuarios ();
        System.out.println ("Digite o índice do Usuário a atualizar: ");
        int index = input.nextInt ();
        input.nextLine ();

        if (index >= 0 && index < Usuarios.size ()) {
            System.out.println ("Digite o novo nome: ");
            String novoNome = input.nextLine ();
            Usuarios.set (index, novoNome);
            System.out.println ("Usuário atualizado com sucesso");
        } else {
            System.out.println ("Índice inválido");
        }
    }

    private static void removerUsuario() {
        System.out.println ("Digite o nome do Usuário: ");
        String novoNome = input.nextLine();
        Usuarios.remove(novoNome);
        System.out.println ("Usuário removido com sucesso");

    }
}

