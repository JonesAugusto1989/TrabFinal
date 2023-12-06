package br.edu.infnet.model.domain.ProjetoFinal.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private static int num;

    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataInicial;

    private boolean web;

    private List<Produto> produtos;

    public Pedido(){

    }

    public Pedido(String descricao,List<Produto> produtos){
        this.descricao = descricao;
        this.dataInicial = LocalDateTime.now();
        this.produtos = produtos;

    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Pedido.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataInicial() {
        return dataInicial;
    }

    public boolean isWeb() {
        return web;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
