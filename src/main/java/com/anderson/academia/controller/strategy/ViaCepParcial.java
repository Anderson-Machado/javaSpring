package com.anderson.academia.controller.strategy;

import com.anderson.academia.model.ViaCep;

public class ViaCepParcial implements ViaCepInterface {

    public String rua;
    public String cidade;
    public String bairro;

    @Override
    public Object responseGerenerateObject(ViaCep value) {
    
        this.rua = value.logradouro;
        this.bairro = value.bairro;
        this.cidade = value.localidade;
        return this;
    }
    
}
