package org.example;

public class Excel implements Documento {
    private String nome;
    private int numeroCelulas;

    public Excel(String nome, int numeroCelulas) {
        this.nome = nome;
        this.numeroCelulas = numeroCelulas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCelulas() {
        return numeroCelulas;
    }

    @Override
    public void gerar(Visitor visitor) {
        Contexto contexto = new Contexto();
        visitor.visitarExcel(this, contexto);
        System.out.println(contexto.obterResultado());
    }
}
