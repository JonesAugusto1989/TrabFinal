package br.edu.infnet.model.domain.ProjetoFinal.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class ProdutoDeserialize extends StdDeserializer<Produto> {

    public ProdutoDeserialize() {
        this(null);
    }

    public ProdutoDeserialize(Class<?> vc) {
        super(vc);
    }


    @Override
    public Produto deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        JsonNode node = jp.getCodec().readTree(jp);

        String  nome = node.get("Nome").asText();
        //float  valor = node.get("valor").asDouble();
        double valorJson = node.get("Valor").asDouble();

        String valorString = node.get("Valor").asText();
        if(valorString.contains(",")) {
            valorString  = valorString.replace(",", ".");
        }
        float valor = Float.parseFloat(valorString);
        //float valor = (float)valorJson;

        int  codigo = node.get("Codigo").asInt();
        Produto produto;

        produto = cadastraSobremesa(node,nome,codigo);
        produto.setNome(nome);
        produto.setValor(valor);
        produto.setCodigo(codigo);

       return produto;

//return new Produto(nome, valor, new User(userId, null));
      //  Produto produto = new Produto(nome,valor,codigo,cadastraSobremesa(node,nome,valor,codigo)) ;
        //return new Produto(nome, valor, new User(userId, null));
    }

    public Sobremesa cadastraSobremesa(JsonNode node,String nome,int codigo){


        String quantidadeString = node.get("Quantidade").asText();
        if(quantidadeString.contains(",")) {
            quantidadeString  = quantidadeString.replace(",", ".");
        }
        float quantidade = Float.parseFloat(quantidadeString);

        //double quantidadeDouble  = node.get("quantidade").asDouble();
        //float quantidade = (float) quantidadeDouble;

        boolean doce = node.get("Doce").asBoolean();
        String informacao = node.get("Informacao").asText();
        //Sobremesa sobremesa = new Sobremesa(nome,valor,codigo,quantidade,doce,informacao);
        Sobremesa sobremesa = new Sobremesa(quantidade,doce,informacao);
        return sobremesa;
    }


}

