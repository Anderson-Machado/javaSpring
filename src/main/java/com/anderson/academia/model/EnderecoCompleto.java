package com.anderson.academia.model;

public class EnderecoCompleto {
    public String Rua;
    public String Cidade;
    public String Bairro;
    
    public void GenerateEnderecoCompleto(ViaCep via){
     Rua = via.logradouro;
     Cidade = via.localidade;
     Bairro = via.bairro;
    } 
    
}
