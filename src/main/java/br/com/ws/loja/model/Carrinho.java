package br.com.ws.loja.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe.tavares on 20/01/16.
 */

@Entity
@Table(name = "tb_carrinho", schema = "lojaws")
public class Carrinho {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_GENERATOR"
    )
    private Long id;

    @OneToMany
    private List<Produto> produto = new ArrayList<Produto>();

    private String rua;
    private String cidade;


    public Carrinho adiciona(Produto produto){
        return  adiciona(produto);
    }

    public Carrinho para(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
        return  this;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
