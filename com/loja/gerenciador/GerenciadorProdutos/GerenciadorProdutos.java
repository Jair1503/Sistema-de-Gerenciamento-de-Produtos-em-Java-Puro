package com.loja.gerenciador.GerenciadorProdutos;

import java.util.ArrayList;

public class GerenciadorProdutos {
    private List<Produto> produtos;
    private int proximoId;
    public GerenciadorProdutos(){
        this.produtos = new ArrayList<>();
        this.proximoId = 1; //ID inicial
    }
    // Método para criar e adicionar produto
    public void criar(Produto produto) {
            produto.setId(proximoId++); // Atribui o próximo ID e incrementa
            produtos.add(produto);
    }
        //Método para validar dados do produto
        private boolean validarProduto(Produto produto){
            return produto != null && produto.getNome() != null && !produto.getNome().isEmpty();
        }
    }
