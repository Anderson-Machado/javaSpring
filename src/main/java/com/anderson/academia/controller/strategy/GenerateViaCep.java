package com.anderson.academia.controller.strategy;

import com.anderson.academia.model.ViaCep;

public class GenerateViaCep {
    
    private ViaCepInterface viaCepInterface;

    public GenerateViaCep(ViaCepInterface viaCepInterface) {
        this.viaCepInterface = viaCepInterface;
    }

    public Object generateObject(ViaCep via){
        return this.viaCepInterface.responseGerenerateObject(via);
    }

}
