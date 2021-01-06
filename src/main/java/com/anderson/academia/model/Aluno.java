package com.anderson.academia.model;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    
    private String Curso;

    public Aluno(String nome,String cpf,String email, String telefone, String curso, ArrayList<Endereco>enderecos) {
        super(nome,cpf,email,telefone);
        setCurso(curso);
        setEnderecos(enderecos);
    }

    private ArrayList<Endereco> enderecos;
    
    public int caculaMensalidade(){
     return 0;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
