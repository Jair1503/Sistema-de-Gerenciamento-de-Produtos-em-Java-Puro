package com.loja.gerenciador.GerenciadorProdutos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> produtos = new ArrayList<>();
    private int proximoId;
    public GerenciadorProdutos(){
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
    public Produto buscarPorId(int id){
        for (Produto produto : produtos){
            if (produto.getId()== id){
                return produto;
            }

        }
        return null;
    }
    }
