package br.edu.infnet.model.domain.ProjetoFinal.model;

public class Sobremesa extends Produto{
    //mudei de float para long
    private float quantidade;

    private boolean doce;

    private String informacao;
    //mudei de float para long
    public Sobremesa(String nome, float valor, int codigo,float quantidade,boolean doce,String informacao) {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacao = informacao;
    }

    //mudei de float para long
    public Sobremesa(float quantidade,boolean doce,String informacao) {
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacao = informacao;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public boolean isDoce() {
        return doce;
    }

    public String getInformacao() {
        return informacao;
    }

    @Override
    String consultarProduto() {
        return null;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "quantidade=" + quantidade +
                ", doce=" + doce +
                ", informacao='" + informacao + '\'' +
                '}';
    }
}
