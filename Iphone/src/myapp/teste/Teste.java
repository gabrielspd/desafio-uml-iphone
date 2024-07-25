package myapp.teste;

import myapp.implementacoes.iPhone;

public class Teste {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Minha Música Favorita");

        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
