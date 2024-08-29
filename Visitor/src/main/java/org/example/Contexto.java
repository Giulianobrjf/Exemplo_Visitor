package org.example;

public class Contexto {
    private StringBuilder resultado = new StringBuilder();

    public void adicionarMensagem(String mensagem) {
        resultado.append(mensagem).append("\n");
    }

    public String obterResultado() {
        return resultado.toString();
    }
}
