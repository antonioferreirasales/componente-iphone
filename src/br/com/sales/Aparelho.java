package br.com.sales;

import br.com.sales.telefone.IPhone;

public class Aparelho {
    public static void main(String[] args) {
        IPhone aparelho = new IPhone();
        aparelho.ligar();
        aparelho.pausar();
        aparelho.selecionarMusica("Perfect blue.");
        aparelho.exibirPagina();
        aparelho.adicionarNovaAba();
        aparelho.atualizarPagina();
        aparelho.iniciarCorreioVoz();
    }
}
