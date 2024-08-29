package org.example;

public class DocumentoVisitor implements Visitor {

    @Override
    public void visitarWord(Word word, Contexto contexto) {
        contexto.adicionarMensagem("Convertendo Word \"" + word.getTitulo() + "\" para PDF.");
        contexto.adicionarMensagem("Número de Páginas: " + word.getNumeroPaginas());
    }

    @Override
    public void visitarExcel(Excel excel, Contexto contexto) {
        contexto.adicionarMensagem("Convertendo Excel \"" + excel.getNome() + "\" para PDF.");
        contexto.adicionarMensagem("Número de Células: " + excel.getNumeroCelulas());
    }

    @Override
    public void visitarPowerPoint(PowerPoint powerPoint, Contexto contexto) {
        contexto.adicionarMensagem("Convertendo PowerPoint \"" + powerPoint.getTitulo() + "\" para PDF.");
        contexto.adicionarMensagem("Número de Slides: " + powerPoint.getNumeroSlides());
    }
}
