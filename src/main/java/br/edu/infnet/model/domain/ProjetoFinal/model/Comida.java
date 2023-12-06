package br.edu.infnet.model.domain.ProjetoFinal.model;

public class Comida extends Produto{

    private float peso;
    private boolean vegano;
    private String ingredientes;

    public Comida(String nome, float valor, int codigo) {
        super(nome, valor, codigo);
    }

    public float getPeso() {
        return peso;
    }

    public boolean isVegano() {
        return vegano;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    @Override
    String consultarProduto() {
        return null;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "peso=" + peso +
                ", vegano=" + vegano +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }
}
