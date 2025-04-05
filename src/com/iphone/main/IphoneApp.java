package com.iphone.main;

import com.iphone.components.*;
import com.iphone.utils.Logger;

public class IphoneApp {
    public static void main(String[] args) {
        // Testando Reprodutor Musical
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        Logger.log("Iniciando o reprodutor musical...");
        reprodutor.tocar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");
        reprodutor.pausar();

        // Testando Aparelho Telefônico
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        Logger.log("Iniciando chamadas telefônicas...");
        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando Navegador
        NavegadorInternet navegador = new NavegadorInternetImpl();
        Logger.log("Iniciando o navegador...");
        navegador.exibirPagina("www.apple.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
