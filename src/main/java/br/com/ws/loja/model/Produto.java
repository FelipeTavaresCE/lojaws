package br.com.ws.loja.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe.tavares on 20/01/16.
 */
@Entity
@Table(name = "tb_produto", schema = "lojaws")
public class Produto {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_GENERATOR"
    )
    private Long id;

    private Double preco;
    private String nome;
    private Integer quantidade;

    @ManyToOne
    private List<Carrinho> carrinhos = new ArrayList<Carrinho>();

    public Produto(Double preco, String nome, Long id, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
