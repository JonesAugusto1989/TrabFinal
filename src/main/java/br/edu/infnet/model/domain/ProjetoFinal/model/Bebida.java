package br.edu.infnet.model.domain.ProjetoFinal.model;

public class Bebida extends Produto{

    private boolean gelada;
    private float tamanho;
    private String marca;

    public Bebida(String nome, float valor, int codigo) {
        super(nome, valor, codigo);
    }

    public boolean isGelada() {
        return gelada;
    }

    public float getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    String consultarProduto() {
        return null;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "gelada=" + gelada +
                ", tamanho=" + tamanho +
                ", marca='" + marca + '\'' +
                '}';
    }
}
