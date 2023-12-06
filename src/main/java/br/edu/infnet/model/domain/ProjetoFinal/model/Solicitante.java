package br.edu.infnet.model.domain.ProjetoFinal.model;

import java.util.List;

public class Solicitante {
    //private int id;
    private String nome;

    private String cpf;

    private String email;

    List<Pedido> pedidos;

    //public int getId() {
      //  return id;
    //}

    /*
    public Solicitante(int id,String nome, String cpf, String email){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;

    }
*/

    public Solicitante(){

    }

    public Solicitante(String nome,String cpf,String email,List<Pedido> pedidos){

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.pedidos = pedidos;

    }

    public Solicitante(String nome, String cpf, String email){

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public String getEmail() {
        return email;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }



}
