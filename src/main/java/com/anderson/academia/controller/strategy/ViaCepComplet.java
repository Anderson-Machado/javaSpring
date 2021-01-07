package com.anderson.academia.controller.strategy;

import com.anderson.academia.model.ViaCep;

public class ViaCepComplet implements ViaCepInterface{

    public String rua;
    public String cidade;
    public String bairro;
    public String cep;
    public String dDD;

    @Override
    public Object responseGerenerateObject(ViaCep value) {
     
        this.bairro = value.bairro;
        this.cep = value.cep;
        this.cidade = value.localidade;
        this.rua = value.logradouro;
        this.dDD = value.ddd;
        return this;
    }
    
}
