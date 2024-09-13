package br.com.sales.telefone;

import br.com.sales.dispositivos.iAparelhoTelefonico;
import br.com.sales.dispositivos.iNavegadorInternet;
import br.com.sales.dispositivos.iReprodutorMusical;

public class IPhone implements iNavegadorInternet, iReprodutorMusical, iAparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando sistema.");
    }

    @Override
    public void atender() {
        System.out.println("Fazendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + ".");
    }
}
