import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DocumentoVisitorTest {

    @Test
    public void deveExibirWord() {
        Word word = new Word("Documento de Texto", 10);

        DocumentoVisitor visitor = new DocumentoVisitor();
        Contexto contexto = new Contexto();
        visitor.visitarWord(word, contexto);
        String resultadoEsperado = "Convertendo Word \"Documento de Texto\" para PDF.\nNúmero de Páginas: 10";
        assertEquals(resultadoEsperado, contexto.obterResultado().trim());
    }

    @Test
    public void deveExibirExcel() {
        Excel excel = new Excel("Planilha Financeira", 100);

        DocumentoVisitor visitor = new DocumentoVisitor();
        Contexto contexto = new Contexto();
        visitor.visitarExcel(excel, contexto);
        String resultadoEsperado = "Convertendo Excel \"Planilha Financeira\" para PDF.\nNúmero de Células: 100";
        assertEquals(resultadoEsperado, contexto.obterResultado().trim());
    }

    @Test
    public void deveExibirPowerPoint() {
        PowerPoint powerPoint = new PowerPoint("Apresentação de Projetos", 20);

        DocumentoVisitor visitor = new DocumentoVisitor();
        Contexto contexto = new Contexto();
        visitor.visitarPowerPoint(powerPoint, contexto);
        String resultadoEsperado = "Convertendo PowerPoint \"Apresentação de Projetos\" para PDF.\nNúmero de Slides: 20";
        assertEquals(resultadoEsperado, contexto.obterResultado().trim());
    }
}
