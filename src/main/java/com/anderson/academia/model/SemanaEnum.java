package com.anderson.academia.model;

public enum SemanaEnum {
//Exemplo de utilização como se fosse enum
   /* SEGUNDA,//0
    TERCA,//1
    QUARTA,//2
    QUINTA,//3
    SEXTA,//4
    SABADO,//5
    DOMINGO//6
    */
    
    //setando valores diferentes para o tipo de enum
    //**Digamos que eu precise cadastrar um tipo de enum na base para salvar com um determinado id */
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7),
    DOMINGO(8);

    private int valor;

    private SemanaEnum(int valor) {
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }

}
