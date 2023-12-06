package br.edu.infnet.model.domain.ProjetoFinal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ProdutoDeserialize.class)
public abstract class Produto{

    private String nome;
    //mudei de float para double
    private float valor;

    private int codigo;
//mudei de float para double
    public Produto(String nome, float valor, int codigo) {

        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }
    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    abstract String consultarProduto();

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }
}
