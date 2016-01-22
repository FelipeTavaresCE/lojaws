package br.com.ws.loja.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe.tavares on 20/01/16.
 */
public class Produto {

    private double preco;
    private String nome;
    private Long id;
    private int quantidade;

    public Produto(double preco, String nome, Long id, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
