package com.artgui.nutrisis;

import com.artgui.nutrisis.viewOlds.FrMenuTemporario;


/*
    Classe principal do programa, que atualmente está responsável apenas por
chamar o menu temporário, é a base do meu programa.
*/
public class NutriSis {

    public static void main(String[] args) {
        FrMenuTemporario tela = new FrMenuTemporario();
        tela.setVisible(true);
    }
}
