package org.example;

public class PowerPoint implements Documento {
    private String titulo;
    private int numeroSlides;

    public PowerPoint(String titulo, int numeroSlides) {
        this.titulo = titulo;
        this.numeroSlides = numeroSlides;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroSlides() {
        return numeroSlides;
    }

    @Override
    public void gerar(Visitor visitor) {
        Contexto contexto = new Contexto();
        visitor.visitarPowerPoint(this, contexto);
        System.out.println(contexto.obterResultado());
    }
}
