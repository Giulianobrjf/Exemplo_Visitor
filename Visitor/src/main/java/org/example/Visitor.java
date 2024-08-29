package org.example;

public interface Visitor {
    void visitarWord(Word word, Contexto contexto);
    void visitarExcel(Excel excel, Contexto contexto);
    void visitarPowerPoint(PowerPoint powerPoint, Contexto contexto);
}
