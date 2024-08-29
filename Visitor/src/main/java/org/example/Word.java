package org.example;

public class Word implements Documento {
    private String titulo;
    private int numeroPaginas;

    public Word(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void gerar(Visitor visitor) {
        Contexto contexto = new Contexto();
        visitor.visitarWord(this, contexto);
        System.out.println(contexto.obterResultado());
    }
}
