package com.artgui.nutrisis;

import com.artgui.nutrisis.view.FrMainScreen;


/*
    Classe principal do programa, que atualmente está responsável apenas por
chamar o menu temporário, é a base do meu programa.
*/
public class NutriSis {

    public static void main(String[] args) {
        FrMainScreen tela = new FrMainScreen();
        tela.setVisible(true);
    }
}
